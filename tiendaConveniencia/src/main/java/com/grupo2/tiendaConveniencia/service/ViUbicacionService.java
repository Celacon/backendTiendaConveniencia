package com.grupo2.tiendaConveniencia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupo2.tiendaConveniencia.entity.ViUbicacion;
import com.grupo2.tiendaConveniencia.repository.ViUbicacionRepository;

@RestController
@RequestMapping("/Viubicacion")
@CrossOrigin
public class ViUbicacionService {

	@Autowired
	ViUbicacionRepository viUbicacionRepository;
	
	@GetMapping(path = "/buscar")
	public List<ViUbicacion> buscar() {
		return viUbicacionRepository.findAll();
	}
}
