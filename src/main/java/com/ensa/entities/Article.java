package com.ensa.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Article {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String titre;
	private String auteur;
	private String affilitation;
	private String etat;
	private String decision;
	private String contenu;
	private String resume;
	@OneToMany(mappedBy = "article")
	private List<Affectation> affectations;
	@ManyToMany
	private List<MotsCles> motCle;
	public Article(Long id, String titre, String affilitation, String etat, String decision, String contenu,
			String resume, List<Affectation> affectations, List<MotsCles> motCle) {
		super();
		this.id = id;
		this.titre = titre;
		this.affilitation = affilitation;
		this.etat = etat;
		this.decision = decision;
		this.contenu = contenu;
		this.resume = resume;
		this.affectations = affectations;
		this.motCle = motCle;
	}
	public Article() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAffilitation() {
		return affilitation;
	}
	public void setAffilitation(String affilitation) {
		this.affilitation = affilitation;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public String getDecision() {
		return decision;
	}
	public void setDecision(String decision) {
		this.decision = decision;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	public List<Affectation> getAffectations() {
		return affectations;
	}
	public void setAffectations(List<Affectation> affectations) {
		this.affectations = affectations;
	}
	public List<MotsCles> getMotCle() {
		return motCle;
	}
	public void setMotCle(List<MotsCles> motCle) {
		this.motCle = motCle;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	
	
	
	
	
}
