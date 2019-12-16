package com.viewnext.apiusuarios.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.viewnext.apiusuarios.entidades.Usuario;
import com.viewnext.apiusuarios.model.AlmacenDAOUsuarios;

@RestController()
@RequestMapping("/api/usuarios")
public class UsuariosController {
	
	// Recibe sin ID en el body de la Request, devuelve con ID
	@PostMapping
	public Usuario crearUsuario(@RequestBody Usuario usuario) {
		return dao.save(usuario);
	}
	
	// Inyeccion de dependencias. Spring instancia el DAO Objeto, no interfaz.
	@Autowired
	private AlmacenDAOUsuarios dao;
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public Usuario getUsuario(@PathVariable Integer id ) {
		return dao.findById(id).orElse(null);
	}
	
	@GetMapping()
	public List<Usuario> leerTodos(){
		return dao.findAll();
	}
	
	@DeleteMapping(value="/{id}")
	public void delete(@PathVariable Integer id) {
		dao.delete(dao.findById(id).orElse(null));
	}
	
	@PutMapping(value="/{id}")
	public Usuario update(@RequestBody Usuario usu) {
		return dao.save(usu);
	}
	
	
}
