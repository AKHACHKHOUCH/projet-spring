package com.ensa.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ensa.entities.Utilisateur;
import com.ensa.services.UtilisateurService;

@RestController
@RequestMapping("users")
@Transactional
public class UtilisateurRestController {

	@Autowired
	UtilisateurService utilisateurService;
	
	@GetMapping("")
	public List<Utilisateur> getAllUsers() {
		return utilisateurService.getAllUsers();
	}
	@GetMapping("/get/{id}")
	public Utilisateur getUser(@PathVariable Long id) {
		return utilisateurService.getUser(id);
	}
	@PostMapping("/add")
	public Utilisateur addUser(@RequestBody Utilisateur user) {
		return utilisateurService.addUser(user);
	}
	@PutMapping("/update/{id}")
	public Utilisateur updateUser(@PathVariable Long id, @RequestBody Utilisateur utilisateur) {
		return utilisateurService.updateUser(utilisateur, id);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteUser(@PathVariable Long id) {
		utilisateurService.deleteUser(id);
	}
	
	
	
	
	
	
}
