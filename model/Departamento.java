package com.example.demo.model;

import java.util.List;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class Departamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int iddepartamento;
	private String nombre;
	private String descripcion;
	@OneToMany(mappedBy = "departamento")
	private List<Programador> programador;
	
}
