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


import com.grupo2.tiendaConveniencia.entity.Ubicacion;
import com.grupo2.tiendaConveniencia.repository.UbicacionRepository;

@RestController
@RequestMapping("/ubicacion")
@CrossOrigin
public class UbicacionService {
	
	@Autowired
	UbicacionRepository ubicacionRepository;

	@GetMapping(path = "/buscar")
	public List<Ubicacion> buscar() {
		return ubicacionRepository.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Ubicacion guardar (@RequestBody Ubicacion ubicacion) {	
		ubicacionRepository.save(ubicacion);
		return ubicacion;		
	}
	
	@DeleteMapping(path ="/eliminar/{idUbicacion}")
	public void eliminar (@PathVariable("idUbicacion") Integer idUbicacion) {
		Optional<Ubicacion>ubicacion = ubicacionRepository.findById(idUbicacion);
		if(ubicacion.isPresent()) {
			ubicacionRepository.delete(ubicacion.get());
		}
	}
	
}
