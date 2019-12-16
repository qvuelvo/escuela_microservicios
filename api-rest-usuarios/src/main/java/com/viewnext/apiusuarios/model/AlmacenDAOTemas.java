package com.viewnext.apiusuarios.model;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viewnext.apiusuarios.entidades.Tema;

public interface AlmacenDAOTemas extends JpaRepository<Tema, Integer>{

}
