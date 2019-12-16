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

import com.viewnext.apiusuarios.entidades.Tema;
import com.viewnext.apiusuarios.model.AlmacenDAOTemas;

@RestController()
@RequestMapping("/api/temas")
public class TemasController {
	
	// Inyeccion de dependencias. Spring instancia el DAO Objeto, no interfaz.
	
	@PostMapping
	public Tema crearTema(@RequestBody Tema tema) {
		return dao.save(tema);
	}
	
	@Autowired
	private AlmacenDAOTemas dao;
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public Tema getTema(@PathVariable Integer id ) {
		return dao.findById(id).orElse(null);
	}
	
	@GetMapping()
	public List<Tema> leerTodos(){
		return dao.findAll();
	}
	
	@DeleteMapping(value="/{id}")
	public void delete(@PathVariable Integer id) {
		dao.delete(dao.findById(id).orElse(null));
	}
	
	@PutMapping(value="/{id}")
	public Tema update(@RequestBody Tema tema) {
		return dao.save(tema);
	}
	
	@RequestMapping(value="/insertaTodos",method=RequestMethod.POST)
	public void insertaTemas(@RequestBody List<Tema> lista) {
		for(Tema tema: lista) {
			dao.save(tema);
		}
	}
	

}
