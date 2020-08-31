package com.ensa.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Utilisateur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false,unique = true)
	protected String username;
	//@JsonIgnore
	@Column(nullable = false)
	protected String password;
	protected boolean actived;
	private String nom;
	private String prenom;
	private String email;
	@ManyToOne
	private Role role;
	@OneToMany(mappedBy = "utilisateur")
	private List<Affectation> affectaions;
	@ManyToOne
	private Comite comite;
	
	public Utilisateur(Long id, String username, String password, boolean actived, String nom, String prenom,
			String email, Role role) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.actived = actived;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.role = role;
	}
	
	public Utilisateur() {
		super();
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isActived() {
		return actived;
	}
	public void setActived(boolean actived) {
		this.actived = actived;
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

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	@JsonIgnore
	public List<Affectation> getAffectaions() {
		return affectaions;
	}

	public void setAffectaions(List<Affectation> affectaions) {
		this.affectaions = affectaions;
	}
	@JsonIgnore
	public Comite getComite() {
		return comite;
	}

	public void setComite(Comite comite) {
		this.comite = comite;
	}


	
}
