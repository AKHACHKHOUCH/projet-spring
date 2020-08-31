package com.ensa.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ensa.entities.MotsCles;
import com.ensa.services.MotsClesService;

@RestController
@RequestMapping("motsCles")
@Transactional
public class MotsClesRestController {

	@Autowired
	MotsClesService motsClesService;
	
	@GetMapping("")
	public List<MotsCles> getAllMotsCles() {
		return motsClesService.getAllMotsCles();
	}
	@PostMapping("/add")
	public MotsCles addMotsCles(@RequestBody MotsCles motsCles) {
		return motsClesService.addMotsCles(motsCles);
	}
	@GetMapping("/get/{id}")
	public MotsCles getMotCle(@PathVariable Long id) {
		return motsClesService.getMotsCles(id);
	}
	@PutMapping("/update/{id}")
	public MotsCles updateMotCle(@PathVariable Long id, @RequestBody MotsCles motsCles) {
		return motsClesService.updateMotsCles(motsCles, id);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteMotCle(@PathVariable Long id) {
		MotsCles mot = motsClesService.getMotsCles(id);
		motsClesService.deleteMotsCles(mot);
	}
	
	
	
	
	
	
	
	
}
