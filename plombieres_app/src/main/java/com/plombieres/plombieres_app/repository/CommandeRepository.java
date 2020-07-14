package com.plombieres.plombieres_app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.plombieres.plombieres_app.model.Commande;

@Repository
public interface CommandeRepository extends CrudRepository<Commande, Long> {

}
