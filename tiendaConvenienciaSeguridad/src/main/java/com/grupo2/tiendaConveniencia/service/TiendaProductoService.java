package com.grupo2.tiendaConveniencia.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.grupo2.tiendaConveniencia.entity.TiendaProducto;
import com.grupo2.tiendaConveniencia.repository.TiendaProductoRepository;

@RestController
@RequestMapping("/tiendaProducto")
@CrossOrigin

public class TiendaProductoService {
	
	@Autowired
	TiendaProductoRepository tiendaProductoRepository;
	
	@GetMapping(path = "/buscar")
	public List<TiendaProducto>buscar(){
		return tiendaProductoRepository.findAll();
	}

	@PostMapping(path = "/guardar")
	public TiendaProducto guardar (@RequestBody TiendaProducto tiendaProducto) {
		tiendaProductoRepository.save(tiendaProducto);
		return tiendaProducto;
	}
	
/*	@DeleteMapping(path = "/eliminar/{id_tienda,id_producto}")
	public void eliminar (@PathVariable("id_tienda,id_producto") Integer idTienda && idProducto) {
		Optional<TiendaProducto>tiendaProducto = tiendaProductoRepository.findById(idTienda && idProducto);
		tiendaProductoRepository.delete(tiendaProducto.get());
		System.out.print("Registro eliminado. Codigo ----" + idTienda && idProducto);

	}
*/
}
