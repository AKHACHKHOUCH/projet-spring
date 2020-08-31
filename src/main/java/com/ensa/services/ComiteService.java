package com.ensa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ensa.entities.Comite;
import com.ensa.entities.Utilisateur;
import com.ensa.repositories.ComiteRepo;

@Service
public class ComiteService {
	@Autowired
	ComiteRepo comiteRepo;
	
	public Comite addComite(Comite comite) {
		return comiteRepo.save(comite);
	}
	public Comite getComite(Long id) {
		return comiteRepo.findById(id).get();
	}
	public List<Comite> getAllComites() {
		return comiteRepo.findAll();
	}
	public List<Utilisateur> getUsers(Long id) {
		return comiteRepo.findById(id).get().getUtilisateurs();
	}
	public Comite updateComite(Comite comite, Long id) {
		Comite c = comiteRepo.findById(id).get();
		c.setNom(comite.getNom());
		c.setUtilisateurs(comite.getUtilisateurs());
		return comiteRepo.save(c);
	}
	public Comite addUtilisateur(Utilisateur user, Comite comite) {
		comite.getUtilisateurs().add(user);
		return comiteRepo.save(comite);
	}
	public void deleteComite(Long id) {
		comiteRepo.deleteById(id);
	}

}
