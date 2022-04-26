package com.example.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.demo.entities.Livre;
import com.example.demo.repository.LivreRepository;

@SpringBootApplication
@ComponentScan
@Configuration
@EnableAutoConfiguration

public class ControleJeeSpringApplication {
	
	@Autowired
	LivreRepository livreRepo;

	public static void main(String[] args) {
		SpringApplication.run(ControleJeeSpringApplication.class, args);
	}



}