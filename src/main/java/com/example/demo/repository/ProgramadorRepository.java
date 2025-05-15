package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Programador;

public interface ProgramadorRepository extends JpaRepository<Programador, Integer> {

}
