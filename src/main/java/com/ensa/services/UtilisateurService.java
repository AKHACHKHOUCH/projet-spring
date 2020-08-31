package com.ensa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ensa.entities.Utilisateur;
import com.ensa.repositories.UtilisateurRepo;

@Service
public class UtilisateurService {

	@Autowired
	UtilisateurRepo utilisateurRepo;
	
	public Utilisateur addUser(Utilisateur utilisateur) {
		return utilisateurRepo.save(utilisateur);
	}
	public List<Utilisateur> getAllUsers() {
		return utilisateurRepo.findAll();
	}
	public Utilisateur getUser(Long id) {
		return utilisateurRepo.findById(id).get();
	}
	public Utilisateur updateUser(Utilisateur user, Long id) {
		Utilisateur u = utilisateurRepo.findById(id).get();
		u.setActived(user.isActived());
		u.setAffectaions(user.getAffectaions());
		u.setComite(user.getComite());
		u.setEmail(user.getEmail());
		u.setNom(user.getNom());
		u.setPrenom(user.getPrenom());
		u.setRole(user.getRole());
		u.setUsername(user.getUsername());
		return utilisateurRepo.save(u);
	}
	public void deleteUser(Long id) {
		utilisateurRepo.deleteById(id);
	}
	
	
	
	
	
}
