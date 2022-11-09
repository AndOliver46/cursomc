package com.andoliver46.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andoliver46.cursomc.domain.Pedido;
import com.andoliver46.cursomc.repositories.PedidoRepository;
import com.andoliver46.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;

	public Pedido findById(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(String.format("ID %d não encontrado", id)));
	}
}
