package com.grupo2.tiendaConveniencia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.grupo2.tiendaConveniencia.entity.VEmpleadosAsignados;
import com.grupo2.tiendaConveniencia.repository.VEmpleadosAsignadosRepository;

@RestController
@RequestMapping("/vEmpleadosAsignados")
@CrossOrigin
public class VEmpleadosAsignadosService {
	@Autowired
	VEmpleadosAsignadosRepository vEmpleadosAsignadosRepository;
	
	
	@GetMapping(path = "/buscar")
	public List<VEmpleadosAsignados> buscar() {
		return vEmpleadosAsignadosRepository.findAll();
	}
}
