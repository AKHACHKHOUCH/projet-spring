package com.ensa.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ensa.entities.Comite;
import com.ensa.entities.Utilisateur;
import com.ensa.services.ComiteService;
import com.ensa.services.UtilisateurService;

@RestController
@RequestMapping("comite")
@Transactional
public class ComiteRestController {

	@Autowired
	ComiteService comiteService;
	@Autowired
	UtilisateurService userService;
	
	@GetMapping("")
	public List<Comite> getAllComite() {
		return comiteService.getAllComites();
	}
	@GetMapping("/getComite/{id}")
	public Comite getComite(@PathVariable Long id) {
		return comiteService.getComite(id);
	}
	@GetMapping("/getUsers/{id}")
	public List<Utilisateur> getUsersByComite(@PathVariable Long id) {
		return comiteService.getUsers(id);
	}
	@PostMapping("/addUser/{id}")
	public boolean addUserToComite(@PathVariable Long id, @RequestBody Utilisateur utilisateur) {
		return comiteService.getComite(id).getUtilisateurs().add(utilisateur);
	}
	@DeleteMapping("/deleteUser/{idUser}/{idComite}")
	public void deleteUserFromComite(@PathVariable Long idUser, @PathVariable Long idComite) {
		Utilisateur user = userService.getUser(idUser);
		Comite comite = user.getComite();
		if(comite.getId() == idComite) {
			user.setComite(null);
			System.out.println("if ***********");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
