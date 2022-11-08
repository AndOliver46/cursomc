package com.andoliver46.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andoliver46.cursomc.domain.Cliente;
import com.andoliver46.cursomc.repositories.ClienteRepository;
import com.andoliver46.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	ClienteRepository repo;

	public Cliente findById(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(String.format("ID %d não encontrado", id)));
	}
}
