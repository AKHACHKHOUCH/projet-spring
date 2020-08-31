package com.ensa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ensa.entities.Affectation;
import com.ensa.repositories.AffectationRepo;

@Service
public class AffectationService {
	@Autowired
	AffectationRepo affectationRepo;

	public Affectation addAffectation(Affectation affectaion) {
		return affectationRepo.save(affectaion);
	}
	public List<Affectation> getAllAffectations() {
		return affectationRepo.findAll();
	}
	public Affectation getAffectation(Long id) {
		return affectationRepo.findById(id).get();
	}
	public Affectation updateAffectation(Affectation affectation, Long id) {
		Affectation a = affectationRepo.findById(id).get();
		a.setArticle(affectation.getArticle());
		a.setCommentaire(affectation.getCommentaire());
		a.setEtat(affectation.getEtat());
		a.setUtilisateur(affectation.getUtilisateur());
		return affectationRepo.save(a);
		
	}
	public void deleteAffectation(Long id) {
		affectationRepo.deleteById(id);
	}
	
	
	
	
}
