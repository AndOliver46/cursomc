package com.andoliver46.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.andoliver46.cursomc.domain.Categoria;

@Repository
public interface CategoriaRespository extends JpaRepository<Categoria, Integer>{
}
