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


import com.grupo2.tiendaConveniencia.entity.Empleado;
import com.grupo2.tiendaConveniencia.entity.Persona;
import com.grupo2.tiendaConveniencia.repository.EmpleadoRepository;
import com.grupo2.tiendaConveniencia.repository.PersonaRepository;

@RestController
@RequestMapping("/empleado")
@CrossOrigin
public class EmpleadoService {
	@Autowired
	EmpleadoRepository empleadoRepository;
	
	@Autowired
	PersonaRepository personaRepository;
	
	@GetMapping(path = "/buscar")
	public List<Empleado> buscar() {
		return empleadoRepository.findAll();
	}

	
	@PostMapping(path = "/guardar")
	public Empleado guardar (@RequestBody Empleado empleado) {	
		Persona persona = empleado.getPersona();
		
		//empleado.setPersona(null);
		personaRepository.save(persona);
		System.out.print(persona.getIdPersona());
		empleado.setIdPersonae(persona.getIdPersona());	

		empleadoRepository.save(empleado);
		return empleado;		
	}
	
	
	@DeleteMapping(path = "/eliminar/{idEmpleado}")
	public void eliminar(@PathVariable ("idEmpleado") Integer idEmpleado) {
		Optional<Empleado> empleado = empleadoRepository.findById(idEmpleado);
		if (empleado.isPresent()) {
			empleadoRepository.delete(empleado.get());
		}
	}
	
}
