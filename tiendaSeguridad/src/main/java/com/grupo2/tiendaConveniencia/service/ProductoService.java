package com.grupo2.tiendaConveniencia.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupo2.tiendaConveniencia.VariablesGlobales;
import com.grupo2.tiendaConveniencia.entity.Producto;
import com.grupo2.tiendaConveniencia.repository.ProductoRepository;

@RestController
@RequestMapping("/producto")
@CrossOrigin
public class ProductoService {

	@Autowired
	ProductoRepository productoRepository;
	
	
	@GetMapping(path = "/buscar")
	public List<Producto> buscar() {
		if (VariablesGlobales.idRolSesion.equals("encargado")) {
			try {
				run("set role encargado");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return productoRepository.findAll();
	}

	
	@PostMapping(path = "/guardar")
	public Producto guardar (@RequestBody Producto producto) {	
		productoRepository.save(producto);
		if (VariablesGlobales.idRolSesion.equals("encargado")) {
			try {
				run("set role encargado");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return producto;		
	}
	
	
	@DeleteMapping(path ="/eliminar/{idProducto}")
	public void eliminar (@PathVariable("idProducto") Integer idProducto) {
		Optional<Producto>prodcuto = productoRepository.findById(idProducto);
		if (VariablesGlobales.idRolSesion.equals("encargado")) {
			try {
				run("set role encargado");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(prodcuto.isPresent()) {
			productoRepository.delete(prodcuto.get());
		}
	}
	
	@Autowired
    private JdbcTemplate jdbcTemplate;
     
    public void run(String sql) throws Exception {
         
       jdbcTemplate.execute(sql);	           
       jdbcTemplate.execute("ALTER SESSION SET CURRENT_SCHEMA=C##TIENDA");      

    }
	
}