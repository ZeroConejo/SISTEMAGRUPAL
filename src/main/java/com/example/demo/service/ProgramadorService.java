package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgramadorService {
	@Autowired
	private ProgramadorRepository repository;
	
	public List<Programador> getAll(){
		return repository.findAll();
	}
	
	public Optional<Pogramador> getById(integer id){
		return repository.findById(id);
	}
	
	public Programador create(Programador programador) {
		return repository.save(programador);
	}
	
	public Programador update(integer id,Programador programador) {
		if (repository.existsById(id)) {
			programador.setIdprogramador(id);
			return repository.save(programador);
		}
		return null;
	}
	
	public void delete(integer id) {
		repository.deleteById(id);
	}
}
