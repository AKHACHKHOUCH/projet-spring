package com.ensa.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String Role;
	private String description;
	@OneToMany(mappedBy = "role")
	private List<Utilisateur> utilisateurs;
	public Role(Long id, String role, String description, List<Utilisateur> utilisateurs) {
		super();
		this.id = id;
		Role = role;
		this.description = description;
		this.utilisateurs = utilisateurs;
	}
	public Role() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@JsonIgnore
	public List<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}
	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}
	

}
