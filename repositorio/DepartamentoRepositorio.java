package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Departamento;

public interface DepartamentoRepositorio extends JpaRepository<Departamento, Integer> {

}
