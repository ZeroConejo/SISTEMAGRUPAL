package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Programador {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idprogramador;
	private String nombre;
	private String apellidos;
	
	@ManyToOne
	@JoinColumn(name = "iddepartamento")
	private Departamento departamento;
	
	@Column(insertable = false, updatable = false)
	private int iddepartamento;

}
