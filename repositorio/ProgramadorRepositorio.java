package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Programador;

public interface ProgramadorRepositorio extends JpaRepository<Programador, Integer> {

}
