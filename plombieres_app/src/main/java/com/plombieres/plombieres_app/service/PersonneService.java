package com.plombieres.plombieres_app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import com.plombieres.plombieres_app.model.Personne;
import com.plombieres.plombieres_app.repository.PersonneRepository;

@Service
public class PersonneService implements IPersonneService  {
	
    @Autowired
    private PersonneRepository repository;

    @Override
    public List<Personne> findAll() {

        var personnes = (List<Personne>) repository.findAll();

        return personnes;
    }
    
    @Override
    public Personne createUser(Personne personne) {
        try {
            Personne personneCree = repository.save(new Personne(personne));
            return personneCree;
        } catch (DuplicateKeyException e) {
            // handle in case of duplicate username
            return null;
        }
    }   
    
}
