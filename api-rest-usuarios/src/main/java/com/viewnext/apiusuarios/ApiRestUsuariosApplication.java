package com.viewnext.apiusuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.viewnext.apiusuarios.entidades.Usuario;

@SpringBootApplication
public class ApiRestUsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestUsuariosApplication.class, args);
		System.out.println("SPRING ARRANCADO CON EXITO");
		
		/*
		Usuario u = new Usuario();
		u.setEmail("eee@eee.com");
		System.out.println(u.getEmail());
		*/
	}

}
