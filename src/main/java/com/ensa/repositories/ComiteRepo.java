package com.ensa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ensa.entities.Comite;

@Repository
public interface ComiteRepo extends JpaRepository<Comite, Long> {

}
