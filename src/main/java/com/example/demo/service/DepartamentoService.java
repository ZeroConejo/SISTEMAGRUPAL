package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Departamento;
import com.example.demo.repository.DepartamentoRepository;


@Service
public class DepartamentoService {
	@Autowired
	private DepartamentoRepository repository;
	
	public List<Departamento> getAll() {
		return repository.findAll();
	}
	
	public Optional<Departamento> getById(Integer id){
		return repository.findById(id);
	}
	
	public Departamento create(Departamento departamento) {
		return repository.save(departamento);
	}
	
	public Departamento update(Integer id, Departamento departamento) {
        if (repository.existsById(id)) {
        	departamento.setIddepartamento(id);
            return repository.save(departamento);
        }
        return null;
    }
	
	public void delete(Integer id) {
        repository.deleteById(id);
    }

}