package com.plombieres.plombieres_app.controller;

import java.net.URI;
import java.util.*;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.plombieres.plombieres_app.model.Commande;
import com.plombieres.plombieres_app.model.Personne;
import com.plombieres.plombieres_app.service.ICommandeService;
import com.plombieres.plombieres_app.service.IPersonneService;


@RestController
@RequestMapping(value="/api")  
@CrossOrigin(origins = "http://localhost:4200")
public class PanierController {
	
	@Autowired
    private IPersonneService personneService;
    
	@Autowired
    private ICommandeService commandeService;

	
	/*@PostMapping({ "/panier" })
	public Commande creerCommande(@RequestBody Personne personne) {
		commandes.add(commande);
		return personne;
	}*/
	
    @GetMapping("/")
    public String findPersonnes() {
        return "showPersonnes";
    }
	
    @GetMapping("/showPersonne")
    public String findPersonnes(Model model) {

        var personne = (List<Personne>) personneService.findAll();

        model.addAttribute("personnes", personne);

        return "showPersonnes";
    }

    
    @GetMapping("/showCommande")
    public String findCommandes(Model model) {

        var commandes = (List<Commande>) commandeService.findAll();

        model.addAttribute("commandes", commandes);

        return "showCommandes";
    }
    
    @PostMapping("/personne")
    public ResponseEntity<?> creerPersonne(@RequestBody Personne personne) {

        try {
            Personne userId = personneService.createUser(personne);

            if (userId == null)
                return ResponseEntity.status(HttpStatus.NOT_MODIFIED).build();
            System.out.println(personne);

            return ResponseEntity.created(URI.create("http://127.0.0.1:8080/personne/" + userId)).build();

        } catch (Exception e) {
            return ResponseEntity.badRequest().header("message", e.getMessage()).build();
        }
    }
}
