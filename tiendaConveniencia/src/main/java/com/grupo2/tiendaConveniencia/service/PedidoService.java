package com.grupo2.tiendaConveniencia.service;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupo2.tiendaConveniencia.entity.Pedido;
import com.grupo2.tiendaConveniencia.entity.Venta;
import com.grupo2.tiendaConveniencia.entity.VentaDetalle;
import com.grupo2.tiendaConveniencia.repository.PedidoRepository;
import com.grupo2.tiendaConveniencia.repository.VentaDetalleRepository;
import com.grupo2.tiendaConveniencia.repository.VentaRepository;

@RestController
@RequestMapping("/pedido")
@CrossOrigin

public class PedidoService {
	
	@Autowired
	PedidoRepository pedidoRepository;
	
	@GetMapping(path = "/buscar")
	public List<Pedido> getAllPedido(){
		return pedidoRepository.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Pedido savePedido(@RequestBody Pedido pedido) {
		return pedidoRepository.save(pedido);
	}

}
