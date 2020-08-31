package com.ensa.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ensa.entities.Affectation;
import com.ensa.services.AffectationService;

@RestController
@RequestMapping("affectations")
public class AffectationControllerRest {

	@Autowired
	AffectationService affectationService;
	
	@GetMapping("")
	public List<Affectation> getAllAffectations() {
		return affectationService.getAllAffectations();
	}
	@GetMapping("/get/{id}")
	public Affectation getAffectation(@PathVariable Long id) {
		return affectationService.getAffectation(id);
	}
	@PostMapping("/add")
	public Affectation addAffectation(@RequestBody Affectation affectation) {
		return affectationService.addAffectation(affectation);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteAffectation(@PathVariable Long id) {
		affectationService.deleteAffectation(id);
	}
	
	
	
	
	
	
	
	
}
