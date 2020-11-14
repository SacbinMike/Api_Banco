package com.app.sacbin.banco.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.app.sacbin.banco.model.entity.Usuario;


@RestController
@RequestMapping("/api")
public class UsuarioController {
	
	@GetMapping("/usuario")
	@ResponseStatus(HttpStatus.OK)
	private Usuario showUsuario() {
		return null;
	}
	
	@GetMapping("/usuario/{term}")
	@ResponseStatus(HttpStatus.OK)
	private Usuario showUsuarioNombre(@PathVariable String term) {
		
		Usuario usuario = new Usuario();
	
		
		usuario.setUsername("Hola");
		usuario.getUsername();
		
		return usuario;
	}
	
    @PostMapping("/usuario")
    private Usuario store(@RequestBody Usuario usuario) {
    	return null;
    }

}
