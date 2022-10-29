package com.grupo2.tiendaConveniencia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupo2.tiendaConveniencia.entity.ViProducto;
import com.grupo2.tiendaConveniencia.repository.ViProductoRepository;

@RestController
@RequestMapping("/ViProducto")
@CrossOrigin
public class ViProductoService {

	@Autowired
	ViProductoRepository viProductoRepository;
	
	
	@GetMapping(path = "/buscar")
	public List<ViProducto> buscar() {
		return viProductoRepository.findAll();
	}
}
