package com.myapi.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapi.domain.Usuario;
import com.myapi.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;
	
public Usuario findById(Integer id) {
	Optional<Usuario> obj=repository.findById(id);
	return obj.orElse(null);
}
}
