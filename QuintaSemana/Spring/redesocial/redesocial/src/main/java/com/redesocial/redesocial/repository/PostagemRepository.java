package com.redesocial.redesocial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.redesocial.redesocial.model.Post;

@Repository
public interface PostagemRepository extends JpaRepository <Post, Long> {

	public List<Post> findAllByTituloContainingIgnoreCase(String titulo);
}
