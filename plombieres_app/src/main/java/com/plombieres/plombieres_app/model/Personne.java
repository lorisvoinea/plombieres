package com.plombieres.plombieres_app.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Personne")
public class Personne {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPersonne;
    @Column(name = "nom")
	private String nom;
    @Column(name = "prenom")
	private String prenom;
    @Column(name = "email")
	private String email;
	
    public Personne() {
    	
    }
    
    public Personne(Personne p) {
        this.idPersonne = p.idPersonne;
        this.nom = p.nom;
        this.prenom = p.prenom;
        this.email = p.email;
    }
    
    public Personne(int idPersonne, String nom, String prenom, String email) {
        this.idPersonne = idPersonne;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdPersonne() {
		return idPersonne;
	}
	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}
	
	
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.idPersonne);
        hash = 79 * hash + Objects.hashCode(this.nom);
        hash = 79 * hash + Objects.hashCode(this.prenom);
        hash = 79 * hash + Objects.hashCode(this.email);
        return hash;
    }
	
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        final Personne other = (Personne) obj;
        
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.prenom, other.prenom)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return Objects.equals(this.idPersonne, other.idPersonne);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Personne{");
        sb.append("idPersonne=").append(idPersonne);
        sb.append(", nom='").append(nom).append('\'');
        sb.append(", prenom='").append(prenom).append('\'');
        sb.append(", email='").append(email).append('\'');       
        sb.append('}');
        return sb.toString();
    }
    

}
