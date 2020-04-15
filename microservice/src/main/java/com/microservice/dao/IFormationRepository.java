package com.microservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.microservice.entities.Etudiant;
import com.microservice.entities.Formation;

@RepositoryRestResource
public interface IFormationRepository extends JpaRepository<Formation, Long> {

	// public List<Formation> findByNomStartsWith(String nom);
	// public List<Formation> findByNomContains(String nom);

}
