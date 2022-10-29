package com.grupo2.tiendaConveniencia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupo2.tiendaConveniencia.entity.Status;
import com.grupo2.tiendaConveniencia.repository.StatusRepository;


@RestController
@RequestMapping("/status")
@CrossOrigin
public class StatusService {
	@Autowired
	StatusRepository statusRepository;
	
	@GetMapping(path = "/buscar")
	public List<Status> buscar() {
		return statusRepository.findAll();
	}

	
	@PostMapping(path = "/guardar")
	public Status guardar (@RequestBody Status status) {	
		statusRepository.save(status);;
		return status;		
	}
	
	
	

}
