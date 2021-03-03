package com.redesocial.redesocial.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redesocial.redesocial.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	public Optional<Usuario> findByUsuario(String usuario);
}
