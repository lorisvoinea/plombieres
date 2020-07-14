package com.plombieres.plombieres_app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import com.plombieres.plombieres_app.model.Commande;
import com.plombieres.plombieres_app.model.Personne;
import com.plombieres.plombieres_app.repository.CommandeRepository;

@Service
public class CommandeService implements ICommandeService  {
	
    @Autowired
    private CommandeRepository repository;

    @Override
    public List<Commande> findAll() {

        var commandes = (List<Commande>) repository.findAll();

        return commandes;
    }

	
	@Override
	public Commande creerCommande(Commande commande) {
        try {
            Commande commandeCree = repository.save(new Commande(commande));
            return commandeCree;
        } catch (DuplicateKeyException e) {
            // handle in case of duplicate
            return null;
        }
    }   
    
    

}
