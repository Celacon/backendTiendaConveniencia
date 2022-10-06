package com.grupo2.tiendaConveniencia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupo2.tiendaConveniencia.entity.Persona;

import com.grupo2.tiendaConveniencia.repository.PersonaRepository;

@RestController
@RequestMapping("/persona")
@CrossOrigin
public class PersonaService {
	
	@Autowired	
	PersonaRepository personaRepository;
	
	@GetMapping(path = "/buscar")
	public List<Persona> buscar() {
		return personaRepository.findAll();
	}

	
	@PostMapping(path = "/guardar")
	public Persona guardar (@RequestBody Persona persona) {	
		personaRepository.save(persona);;
		return persona;		
	}
	

}
