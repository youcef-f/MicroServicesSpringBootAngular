package com.microservice.dao.projection;

import org.springframework.data.rest.core.config.Projection;

import com.microservice.entities.Etudiant;


// une projection est équivalent d'une vue
@Projection(name = "p1", types = { Etudiant.class })
public interface IEtudiantProjection {
	public String getNom();
}
