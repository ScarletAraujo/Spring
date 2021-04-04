package ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ecommerce.model.produto;
import ecommerce.repository.ecommerce;

@RestController
@RequestMapping("/produtos")
@CrossOrigin("*")
public class produtoController {
	
	
	@Autowired
	private ecommerce<produto> repository;
	
	
	@GetMapping
	public ResponseEntity<List<produto>> GetAll(){
	return ResponseEntity.ok(repository.findAll());
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<produto> GetById(@PathVariable long id){
	return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
			.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<produto>> GetByNome(@PathVariable String nome){
	return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(nome));
	}
	
	@PostMapping
	public ResponseEntity<produto> Post(@RequestBody produto produto){
	return ResponseEntity.ok(repository.save(produto));
	}
	
	@PutMapping
	public ResponseEntity<produto> Put(@RequestBody produto produto){
	return ResponseEntity.ok(repository.save(produto));
	}
	
	@DeleteMapping("/{id}")
	public void Delete(@PathVariable long id) {
	repository.deleteById(id);
	}
	
	
	

}



