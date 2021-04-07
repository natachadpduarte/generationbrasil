package com.redesocial.redesocial.controller;

	import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redesocial.redesocial.model.UserLogin;
import com.redesocial.redesocial.model.Usuario;
import com.redesocial.redesocial.repository.UsuarioRepository;
import com.redesocial.redesocial.service.UsuarioService;

	@RestController
	@RequestMapping("/usuarios")
	@CrossOrigin(origins = "*", allowedHeaders = "*")

	public class UsuarioController {

		
		@Autowired
		private UsuarioRepository repository;
		
		@Autowired
		private UsuarioService usuarioService;
		
	
		
		
		
		@GetMapping
	    public ResponseEntity<List<Usuario>> GetAll(){
	        return ResponseEntity.ok(repository.findAll());
	    }

		
		@GetMapping("/{id}")
		public ResponseEntity<Usuario> findById(@PathVariable long id){
			return ResponseEntity.ok(usuarioService.getById(id));
		}

		
		@PostMapping("/logar")
		public ResponseEntity<UserLogin> Autentication(@RequestBody Optional<UserLogin> user) {
			return usuarioService.Logar(user).map(resp -> ResponseEntity.ok(resp))
					.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
					
			
		}
		
		@PostMapping("/cadastrar")
				public ResponseEntity<Usuario> Post (@RequestBody Usuario usuario) {
			return ResponseEntity.status(HttpStatus.CREATED)
					.body(usuarioService.CadastrarUsuario(usuario)); 
			}
		
	}
		

