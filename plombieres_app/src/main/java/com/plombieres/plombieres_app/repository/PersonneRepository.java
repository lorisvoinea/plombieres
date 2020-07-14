package com.plombieres.plombieres_app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.plombieres.plombieres_app.model.Personne;

@Repository
public interface PersonneRepository extends CrudRepository<Personne, Long> {

}
