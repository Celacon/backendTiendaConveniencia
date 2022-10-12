package com.grupo2.tiendaConveniencia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupo2.tiendaConveniencia.entity.VentaDetalle;
import com.grupo2.tiendaConveniencia.repository.VentaDetalleRepository;

@RestController
@RequestMapping("/ventaDetalle")
@CrossOrigin

public class VentaDetalleService {
	
	@Autowired
	VentaDetalleRepository ventaDetalleRepository;
	
	@GetMapping(path = "/buscar")
	public List<VentaDetalle> getAllVentaDetalle(){
		return ventaDetalleRepository.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public VentaDetalle saveVentaDetalle(@RequestBody VentaDetalle ventaDetalle) {
		return ventaDetalleRepository.save(ventaDetalle);
	}

}
