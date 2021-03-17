package com.example.hellogeneration.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hellogeneration")


public class GenerationController {
	
	@GetMapping
	
	public String hellogeneration () {
		return "O que eu espero da Generation.... Espero me reiventar, aprender cada dia mais, e porque não sair com um emprego lindo e "
				+ "bela, me destacando cada dia mais, graças a Generation.";
		
	}

}
