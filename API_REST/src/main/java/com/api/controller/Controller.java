package com.api.controller;


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
import org.springframework.web.bind.annotation.CrossOrigin;
import com.api.model.Pessoa;
import com.api.repository.Repository;

@RestController
@RequestMapping("api/v1")
@CrossOrigin

public class Controller {
	
	@Autowired
	Repository repo;

	@PostMapping("/pessoa")
	public Pessoa salvarPessoa (@RequestBody Pessoa pessoa) {
		return repo.save(pessoa);
	}
	
	@PutMapping("/pessoa")
	public Pessoa alterarPessoa(@RequestBody Pessoa pessoa) {
		return repo.save(pessoa);
	}
		
	@DeleteMapping("/pessoa/{id}")
	public void excluirPessoa(@PathVariable long id) {
		
		repo.deleteById(id);

	}		
	
	@GetMapping("/pessoa/{id}")
	public Optional<Pessoa> buscarPessoa(@PathVariable long id) {
		
		return repo.findById(id);
	}

	@GetMapping("/pessoa")
	public List<Pessoa> listarTodos() {
		
		return repo.findAll();
	}
}
