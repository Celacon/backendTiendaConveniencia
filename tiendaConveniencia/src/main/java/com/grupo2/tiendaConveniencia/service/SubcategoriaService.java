package com.grupo2.tiendaConveniencia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupo2.tiendaConveniencia.entity.Subcategoria;
import com.grupo2.tiendaConveniencia.repository.SubcategoriaRepository;

@RestController
@RequestMapping("/subcategoria")
@CrossOrigin
public class SubcategoriaService {
	@Autowired
	SubcategoriaRepository subcategoriaRepository;
	
	@GetMapping(path = "/buscar")
	public List<Subcategoria> buscar() {
		return subcategoriaRepository.findAll();
	}

	
	@PostMapping(path = "/guardar")
	public Subcategoria guardar (@RequestBody Subcategoria subcategoria) {	
		subcategoriaRepository.save(subcategoria);;
		return subcategoria;		
	}
}
