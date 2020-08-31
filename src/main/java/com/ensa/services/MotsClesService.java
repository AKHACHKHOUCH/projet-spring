package com.ensa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ensa.entities.MotsCles;
import com.ensa.repositories.MotsClesRepo;

@Service
public class MotsClesService {
	@Autowired
	MotsClesRepo motsClesRepo;
	
	public MotsCles addMotsCles(MotsCles mot) {
		return motsClesRepo.save(mot);
	}
	public MotsCles getMotsCles(Long id) {
		return motsClesRepo.findById(id).get();
	}
	public List<MotsCles> getAllMotsCles() {
		return motsClesRepo.findAll();
	}
	public MotsCles updateMotsCles(MotsCles mot, Long id) {
		MotsCles m = motsClesRepo.findById(id).get();
		m.setMotCle(mot.getMotCle());
		return motsClesRepo.save(m);
	}
	public void deleteMotsCles(MotsCles mot) {
		motsClesRepo.delete(mot);
	}
	
	
	

}
