package com.grupo2.tiendaConveniencia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.grupo2.tiendaConveniencia.entity.Empleado;
import com.grupo2.tiendaConveniencia.repository.EmpleadoRepository;

@RestController
@RequestMapping("/empleado")
@CrossOrigin
public class EmpleadoService {
	@Autowired
	EmpleadoRepository empleadoRepository;
	
	@GetMapping(path = "/buscar")
	public List<Empleado> buscar() {
		return empleadoRepository.findAll();
	}

	
	@PostMapping(path = "/guardar")
	public Empleado guardar (@RequestBody Empleado empleado) {	
		empleadoRepository.save(empleado);;
		return empleado;		
	}
	
}
