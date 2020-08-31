package com.ensa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ensa.entities.Affectation;

@Repository
public interface AffectationRepo extends JpaRepository<Affectation, Long>{

}
