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

import com.ensa.entities.Role;
import com.ensa.services.RoleService;

@RestController
@RequestMapping("role")
@Transactional
public class RoleRestController {

	@Autowired
	RoleService roleService;
	
	@GetMapping("")
	public List<Role> getAllRoles() {
		return roleService.getAllRoles();
	}
	@GetMapping("/get/{id}")
	public Role getRole(@PathVariable Long id) {
		return roleService.getRole(id);
	}
	@PostMapping("/add")
	public Role addRole(@RequestBody Role role) {
		return roleService.addRole(role);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteRole(@PathVariable Long id) {
		roleService.deleteRole(id);
	}
	
	
	
	
	
	
}
