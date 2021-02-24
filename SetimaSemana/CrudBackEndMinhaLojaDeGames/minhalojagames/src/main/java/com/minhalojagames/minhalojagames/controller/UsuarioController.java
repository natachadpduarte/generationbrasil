package com.minhalojagames.minhalojagames.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minhalojagames.minhalojagames.model.Usuario;
import com.minhalojagames.minhalojagames.repository.UsuarioRepository;


@RestController
@RequestMapping("/usuariosGame")
@CrossOrigin("*")

public class UsuarioController {

	@Autowired
	private UsuarioRepository repository;
	

	@GetMapping
	public ResponseEntity<List<Usuario>> GetAll() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Usuario> GetById(@PathVariable long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/nickname/{nickname}")
	public ResponseEntity<List<Usuario>> GetByUsuario(@PathVariable String nickname){
		return ResponseEntity.ok(repository.findAllByNicknameContainingIgnoreCase(nickname));
	}
	
	@PostMapping
	public ResponseEntity<Usuario> post(@RequestBody Usuario Usuario){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(Usuario));
	}
	
	@PutMapping
	public ResponseEntity<Usuario> put (@RequestBody Usuario Usuario){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(Usuario));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
}
