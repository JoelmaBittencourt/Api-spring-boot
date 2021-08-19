package com.myapi;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.myapi.domain.Usuario;
import com.myapi.repository.UsuarioRepository;

@SpringBootApplication
public class MyapiApplication implements CommandLineRunner {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(MyapiApplication.class, args);
	}

	@Override//vem do myapi
	public void run(String... args) throws Exception {

		Usuario u1= new Usuario(null, "joelma B", "joelma", "1234");
		Usuario u2= new Usuario(null, "Diego B", "Diego", "10000");
		
		usuarioRepository.saveAll(Arrays.asList(u1,u2));
	}

}
