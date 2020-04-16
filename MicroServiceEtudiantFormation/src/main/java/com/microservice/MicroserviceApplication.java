package com.microservice;

import java.util.Date;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.microservice.dao.IEtudiantRepository;
import com.microservice.dao.IFormationRepository;
import com.microservice.entities.Etudiant;
import com.microservice.entities.Formation;

@SpringBootApplication
public class MicroserviceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		
		 SpringApplication.run(MicroserviceApplication.class, args);
		
	}
	
	@Autowired
	private IEtudiantRepository etudiantRepository;

	@Autowired
	private  IFormationRepository formationRepository;
	
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration ; 
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		repositoryRestConfiguration.exposeIdsFor(Etudiant.class,Formation.class);

		Formation formation1 =  formationRepository.save(new Formation(null,"PHP", 10,null));
		Formation formation2 =  formationRepository.save(new Formation(null,"JAVA", 10,null));
		Formation formation3 =  formationRepository.save(new Formation(null,"ORACLE", 10,null));
		

		Etudiant etudiant1 = new Etudiant(null,"youcef","youcef", new Date(),formation1) ;
		Etudiant etudiant2 = new Etudiant(null,"mohamed","mohamed", new Date(),formation2) ;
		Etudiant etudiant3 = new Etudiant(null,"fatima","fatima", new Date(),formation2) ;
		Etudiant etudiant4 = new Etudiant(null,"kamal","kamal", new Date(),formation3) ;

		etudiantRepository.save(etudiant1) ; 
		etudiantRepository.save(etudiant2) ; 
		etudiantRepository.save(etudiant3) ; 
		etudiantRepository.save(etudiant4) ; 
		
		
		
	}

}
