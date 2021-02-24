package com.minhalojagames.minhalojagames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minhalojagames.minhalojagames.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	List<Categoria> findAllByCategoriaContainingIgnoreCase(String categoria);
	/*List<Categoria> findAllBySubcategoriaContainingIgnoreCase(String subcategoria);*/
}
