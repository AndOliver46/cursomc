package com.andoliver46.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andoliver46.cursomc.domain.Categoria;
import com.andoliver46.cursomc.repositories.CategoriaRespository;
import com.andoliver46.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	CategoriaRespository repo;
	
	public Categoria findById(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(String.format("ID %d não encontrado", id)));
	}
}
