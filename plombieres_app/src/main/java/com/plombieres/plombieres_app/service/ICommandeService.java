package com.plombieres.plombieres_app.service;

import java.util.List;

import com.plombieres.plombieres_app.model.Commande;

public interface ICommandeService {
	
	List<Commande> findAll();
	
	Commande creerCommande(Commande commande);
	
}
