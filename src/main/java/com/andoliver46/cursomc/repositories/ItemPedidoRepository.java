package com.andoliver46.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.andoliver46.cursomc.domain.ItemPedido;
import com.andoliver46.cursomc.domain.pk.ItemPedidoPK;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, ItemPedidoPK>{
}
