package com.grupo2.tiendaConveniencia.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	
	@GetMapping(path = "/buscar/{idpersona}")
	public List<Persona> buscarPorIdpersona(@PathVariable("idpersona") Integer idPersona) {
		return personaRepository.findByIdPersona(idPersona);
	}
	

	
	
	@PostMapping(path = "/guardar")
	public Persona guardar (@RequestBody Persona persona) {	
		personaRepository.save(persona);;
		return persona;		
	}
	
	
	@DeleteMapping(path = "/eliminar/{idPersona}")
	public void eliminar(@PathVariable ("idPersona") Integer idPersona) {
		Optional<Persona> persona = personaRepository.findById(idPersona);
		if (persona.isPresent()) {
			personaRepository.delete(persona.get());
		}
	}
	

}