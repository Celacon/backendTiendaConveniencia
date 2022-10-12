package com.grupo2.tiendaConveniencia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupo2.tiendaConveniencia.entity.Venta;
import com.grupo2.tiendaConveniencia.repository.VentaRepository;

@RestController
@RequestMapping("/venta")
@CrossOrigin
public class VentaService {
	
	@Autowired
	VentaRepository ventaRepository;
	
	@GetMapping(path = "/buscar")
	public List<Venta> getAllVenta(){
		return ventaRepository.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Venta saveVenta(@RequestBody Venta venta) {
		return ventaRepository.save(venta);
	}
	
}
