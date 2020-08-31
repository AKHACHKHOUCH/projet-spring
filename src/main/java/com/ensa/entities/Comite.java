package com.ensa.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Comite {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	private Long id;
	private String nom;
	@OneToMany(mappedBy = "comite")
	private List<Utilisateur> utilisateurs;
	public Comite(Long id, String nom, List<Utilisateur> utilisateurs) {
		super();
		this.id = id;
		this.nom = nom;
		this.utilisateurs = utilisateurs;
	}
	public Comite() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}
	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}
	
	
	
	
	
}
