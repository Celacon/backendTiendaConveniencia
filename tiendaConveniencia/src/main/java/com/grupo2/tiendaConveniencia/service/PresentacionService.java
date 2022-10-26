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

import com.grupo2.tiendaConveniencia.entity.Presentacion;


import com.grupo2.tiendaConveniencia.repository.PresentacionRepository;




@RestController
@RequestMapping("/presentacion")
@CrossOrigin
public class PresentacionService {
	
	@Autowired	
	PresentacionRepository presentacionRepository;
	
	@GetMapping(path = "/buscar")
	public List<Presentacion> buscar() {
		return presentacionRepository.findAll();
	}

	
	@PostMapping(path = "/guardar")
	public Presentacion guardar (@RequestBody Presentacion presentacion) {	
		presentacionRepository.save(presentacion);
		return presentacion;		
	}
	
	@DeleteMapping(path ="/eliminar/{id_presentacion}")
	public void eliminar (@PathVariable("id_presentacion") Integer idPresentacion) {
		Optional<Presentacion>presentacion = presentacionRepository.findById(idPresentacion);
		presentacionRepository.delete(presentacion.get());
		System.out.print("Registro eliminado. Codigo ----" + idPresentacion);

	}

	

	
	
	
}
