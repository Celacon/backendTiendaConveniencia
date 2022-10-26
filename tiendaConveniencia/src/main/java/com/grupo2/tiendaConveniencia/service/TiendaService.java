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

import com.grupo2.tiendaConveniencia.entity.Tienda;
import com.grupo2.tiendaConveniencia.repository.TiendaRepository;

@RestController
@RequestMapping("/tienda")
@CrossOrigin

public class TiendaService {

	@Autowired
	TiendaRepository tiendaRepository;
	
	
	@GetMapping(path = "/buscar")
	public List<Tienda>buscar(){
		return tiendaRepository.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Tienda guardar (@RequestBody Tienda tienda) {
		tiendaRepository.save(tienda);
		return tienda;
	}
	
	@DeleteMapping(path = "/eliminar/{id_tienda}")
	public void eliminar (@PathVariable("id_tienda") Integer idTienda) {
		Optional<Tienda>tienda = tiendaRepository.findById(idTienda);
		tiendaRepository.delete(tienda.get());
		System.out.print("Registro eliminado. Codigo ----" + idTienda);

	}
}
