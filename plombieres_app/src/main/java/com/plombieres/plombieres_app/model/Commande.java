package com.plombieres.plombieres_app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Commande")
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int idCommande;
    @Column(name = "offre")
	private int offre;
    @Column(name = "personne")
	private int idPersonne;
    @Column(name = "total")
	private int total;
	
	public Commande() {
	}
	
	public Commande(int idCommande, int offre, int idPersonne, int total) {
		super();
		this.idCommande = idCommande;
		this.offre = offre;
		this.idPersonne = idPersonne;
		this.total = total;
	}

	public int getOffre() {
		return offre;
	}
	public void setOffre(int offre) {
		this.offre = offre;
	}
	public int getPersonne() {
		return idPersonne;
	}
	public void setPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getIdCommande() {
		return idCommande;
	}
	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}
	
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idCommande;
		result = prime * result + idPersonne;
		result = prime * result + offre;
		result = prime * result + total;
		return result;
	}
    
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Commande other = (Commande) obj;
		if (idCommande != other.idCommande)
			return false;
		if (idPersonne != other.idPersonne)
			return false;
		if (offre != other.offre)
			return false;
		if (total != other.total)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Commande [idCommande=" + idCommande + ", offre=" + offre + ", idPersonne=" + idPersonne + ", total="
				+ total + "]";
	}



    
    
	
	

}
