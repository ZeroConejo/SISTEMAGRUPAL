package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Departamento;
import com.example.demo.service.DepartamentoService;

@RestController
@RequestMapping("/Departamentos") 
public class DepartamentoController {
	@Autowired
	private DepartamentoService service;
	
	@GetMapping   //GET http://localhost:8072/Departamentos
	public List<Departamento> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/{Id}")
	public Optional<Departamento> getById(@PathVariable("Id") Integer id){
		return service.getById(id);
	}
	@PostMapping      //POST: JSON  http://localhost:8072/Departamentos
	public Departamento create(@RequestBody Departamento departamento) {
		return service.create(departamento);
	}
	
	@PutMapping("/{Id}")
	public Departamento update(@PathVariable("Id") Integer id,
			@RequestBody Departamento departamento) {
		return service.update(id, departamento);
	}
	
	@DeleteMapping("/{Id}")
	public void delete(@PathVariable("Id") Integer id) {
		service.delete(id);
	}
}
