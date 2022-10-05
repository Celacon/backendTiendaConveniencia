package com.grupo2.tiendaConveniencia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupo2.tiendaConveniencia.entity.Categoria;

import com.grupo2.tiendaConveniencia.repository.CategoriaRepository;

@RestController
@RequestMapping("/categoria")
@CrossOrigin
public class CategoriaService {
	
	@Autowired
	CategoriaRepository categoriaRepository;
	
	@GetMapping(path = "/buscar")
	public List<Categoria> buscar() {
		return categoriaRepository.findAll();
	}

	
	@PostMapping(path = "/guardar")
	public Categoria guardar (@RequestBody Categoria categoria) {	
		categoriaRepository.save(categoria);;
		return categoria;		
	}
	

}
