package com.grupo2.tiendaConveniencia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
		presentacionRepository.save(presentacion);;
		return presentacion;		
	}
	


	

	
	
	
}
