package com.microservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.microservice.entities.Etudiant;

@RepositoryRestResource  

public interface IEtudiantRepository extends JpaRepository<Etudiant, Long> {

	public List<Etudiant> findByNomStartsWith(String nom);
	public List<Etudiant> findByNomContains(String nom);
	public List<Etudiant> findByPrenomContains(String nom);

	// @query ("select p from Etudiant e where e.nom like :x")
	// public List<Etudiant> contient(@Param("x")String nom) ;

}
