package com.ensa.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MotsCles {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String motCle;
	public MotsCles(Long id, String motCle) {
		super();
		this.id = id;
		this.motCle = motCle;
	}
	
	public MotsCles() {
		super();
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMotCle() {
		return motCle;
	}
	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}
	

}
