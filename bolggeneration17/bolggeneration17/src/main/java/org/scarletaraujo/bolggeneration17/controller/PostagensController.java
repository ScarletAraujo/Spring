package org.scarletaraujo.bolggeneration17.controller;



import org.scarletaraujo.bolggeneration17.repository.postagemRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.scarletaraujo.bolggeneration17.model.Postagem;

@RestController 
@RequestMapping ("/postagens")
@CrossOrigin ("*")

public class PostagensController {
	
	@Autowired
	private postagemRepository repository;
	
	@GetMapping
	public ResponseEntity <List<Postagem>> GetAll () {
	return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping ("/{id}")
	public ResponseEntity<Postagem> GetById(@PathVariable long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());		
	}
	
	@GetMapping ("/titulo{titulo}")
	public ResponseEntity<List<Postagem>> GetByTitulo(@PathVariable String titulo){
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
		
	}
}
	
