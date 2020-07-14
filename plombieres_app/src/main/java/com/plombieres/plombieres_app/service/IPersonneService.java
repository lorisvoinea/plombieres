package com.plombieres.plombieres_app.service;

import java.util.List;

import com.plombieres.plombieres_app.model.Personne;

public interface IPersonneService {
	
	List<Personne> findAll();
	
	Personne createUser(Personne personne);

}
