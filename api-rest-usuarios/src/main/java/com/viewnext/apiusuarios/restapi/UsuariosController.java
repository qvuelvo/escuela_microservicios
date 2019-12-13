package com.viewnext.apiusuarios.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.viewnext.apiusuarios.entidades.Usuario;
import com.viewnext.apiusuarios.model.AlmacenDAOUsuarios;

@RestController()
@RequestMapping("/api")
public class UsuariosController {
	
	// Inyeccion de dependencias. Spring instancia el DAO Objeto, no interfaz.
	@Autowired
	private AlmacenDAOUsuarios dao;
	
	@RequestMapping(path="/usuarios",method=RequestMethod.GET)
	public Usuario getUsuario() {
		return new Usuario(-1,"OK","email","password");
	}
	
	// Recibe sin ID en el body de la Request, devuelve con ID
	@PostMapping("/usuarios")
	public Usuario crearUsuario(@RequestBody Usuario usuario) {
		return dao.save(usuario);
	}
}
