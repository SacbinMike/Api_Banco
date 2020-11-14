package com.app.sacbin.banco.model.service;

import com.app.sacbin.banco.model.entity.Usuario;

public interface IUsuarioService {
	public Usuario findByUsername(String username);
}
