package com.ensa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ensa.entities.Role;
import com.ensa.repositories.RoleRepo;

@Service
public class RoleService {
	@Autowired
	RoleRepo roleRepo;

	public List<Role> getAllRoles() {
		return roleRepo.findAll();
	}
	public Role addRole(Role role) {
		return roleRepo.save(role);
	}
	public Role getRole(Long id) {
		return roleRepo.findById(id).get();
	}
	public void deleteRole(Long id) {
		roleRepo.deleteById(id);
	}
	
	
	
	
	
}
