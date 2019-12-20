package com.viewnext.apiusuarios.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import com.viewnext.apiusuarios.entidades.Tema;
import com.viewnext.apiusuarios.entidades.Usuario;
import com.viewnext.apiusuarios.model.AlmacenDAOTemas;
import com.viewnext.apiusuarios.model.AlmacenDAOUsuarios;

@SpringBootTest
class ApiRestUsuariosApplicationTests {
	
	@Autowired
	private AlmacenDAOTemas daoTemas;
	
	@Autowired
	private AlmacenDAOUsuarios daoUsu;
	
	@Test
	void contextLoads() {
		
	}

	@Test
	void testTemaPreferido() {
		Tema tema = daoTemas.findById(1).orElse(null);
		assertEquals(1,tema.getId());
		assertNotEquals(0, tema.getTema().length());
		
		Usuario usu = daoUsu.findById(1).orElse(null);
		/*assertNotNull(usu);
		//usu.setIdTemaPreferido(tema.getId());
		
		daoUsu.save(usu);
		usu = daoUsu.findById(1).orElse(null);
		
		Integer idTemaPreferido = usu.getIdTemaPreferido();
		assertEquals(tema.getId(),idTemaPreferido);
		
		Tema temaPreferido = usu.getTemaPreferido();
		assertEquals(tema.getTema(),temaPreferido.getTema());
		
		List<Usuario> usuariosPref = tema.getUsuariosPref();
		for (Usuario usuario : usuariosPref) {
			System.out.println("Usuario "+ usuario.getNombre());
		}
		assertNotEquals(0,usuariosPref.size());
		*/
			
	}

}
