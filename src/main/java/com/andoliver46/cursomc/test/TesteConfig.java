package com.andoliver46.cursomc.test;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.andoliver46.cursomc.domain.Categoria;
import com.andoliver46.cursomc.repositories.CategoriaRespository;

@Configuration
public class TesteConfig implements CommandLineRunner {

	@Autowired
	CategoriaRespository repo;
	
	@Override
	public void run(String... args) throws Exception {

		Categoria cat1 = new Categoria(1, "Informática");
		Categoria cat2 = new Categoria(2, "Escritório");
		
		repo.saveAll(Arrays.asList(cat1,cat2));
		
	}

}
