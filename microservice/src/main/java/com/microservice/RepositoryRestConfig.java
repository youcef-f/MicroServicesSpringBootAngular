package com.microservice;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

import com.microservice.entities.Etudiant;
import com.microservice.entities.Formation;

@Configuration
public class RepositoryRestConfig extends RepositoryRestConfigurerAdapter { 

    @Override 
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) { 
     config.setReturnBodyOnCreate(true);
     config.setReturnBodyOnCreate(true);
     config.setReturnBodyForPutAndPost(true);
     config.exposeIdsFor(Etudiant.class,Formation.class); // n'expose que ces classes
    	config.getCorsRegistry() 
        .addMapping("/**") 
        .allowedOrigins("*") 
        .allowedHeaders("*") 
        .allowedMethods("OPTIONS", "HEAD", "GET", "PUT", "POST", "DELETE", "PATCH"); 
    } 

} 
