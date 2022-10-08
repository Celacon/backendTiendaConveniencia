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

import com.grupo2.tiendaConveniencia.entity.Categoria;

import com.grupo2.tiendaConveniencia.repository.CategoriaRepository;
import com.grupo2.tiendaConveniencia.repository.SubcategoriaRepository;

@RestController
@RequestMapping("/categoria")
@CrossOrigin
public class CategoriaService {
	
	@Autowired
	CategoriaRepository categoriaRepository;
	
	@Autowired
	SubcategoriaRepository subcategoriaRepository;
	
	@GetMapping(path = "/buscar")
	public List<Categoria> buscar() {
		return categoriaRepository.findAll();
	}

	
	@PostMapping(path = "/guardar")
	public Categoria guardar (@RequestBody Categoria categoria) {	
		categoriaRepository.save(categoria);;
		return categoria;		
	}
	
	
	@DeleteMapping(path ="/eliminar/{idCategoria}")
	public void eliminar (@PathVariable("idCategoria") Integer idCategoria) {
		Optional<Categoria>categoria = categoriaRepository.findById(idCategoria);
		if(categoria.isPresent()) {
			subcategoriaRepository.deleteAll(categoria.get().getSubCategoriaList());
			categoriaRepository.delete(categoria.get());
		}
	}
	

}
