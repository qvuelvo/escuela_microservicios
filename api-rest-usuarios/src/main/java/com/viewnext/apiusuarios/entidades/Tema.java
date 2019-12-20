package com.viewnext.apiusuarios.entidades;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Tema {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull
	@Size(min = 1, max = 50)
	@Column(unique = true)
	private String tema;
	
	@OneToMany(fetch= FetchType.EAGER)
	@JoinColumn(name = "id_tema_preferido")
	@JsonBackReference
	private List<Usuario> usuariosPref;
	
	@NotNull
	@Size(min = 1, max = 255)
	private String descripcion;

	@Column(name = "timestamp", nullable = false, updatable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	private Date timestamp;

	public Tema(Integer id, String nombre, String descripcion) {
		super();
		this.id = id;
		this.tema = nombre;
		this.descripcion = descripcion;
	}

	public Tema() {
		super();
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String nombre) {
		this.tema = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public List<Usuario> getUsuariosPref() {
		return usuariosPref;
	}

	public void setUsuariosPref(List<Usuario> usuariosPref) {
		this.usuariosPref = usuariosPref;
	}

}
