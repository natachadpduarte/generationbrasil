package com.Hopper.RedeHopper.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hopper.RedeHopper.model.PostagemEntidade;

@Repository
public interface PostagemRepository extends JpaRepository<PostagemEntidade, Long> {
	
	List<PostagemEntidade> findAllByTituloContainingIgnoreCase(String titulo);

	
}
