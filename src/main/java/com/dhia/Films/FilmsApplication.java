package com.dhia.Films;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.dhia.Films.model.Films;
import com.dhia.Films.service.FilmService;

@SpringBootApplication
public class FilmsApplication implements CommandLineRunner {

    @Autowired
    FilmService filmService;
    
    @Autowired 
    private RepositoryRestConfiguration repositoryRestConfiguration; 
    
    public static void main(String[] args) {
        SpringApplication.run(FilmsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    	repositoryRestConfiguration.exposeIdsFor(Films.class); 
        
    }
}
