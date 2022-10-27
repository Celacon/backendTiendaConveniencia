package com.grupo2.tiendaConveniencia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupo2.tiendaConveniencia.VariablesGlobales;
import com.grupo2.tiendaConveniencia.entity.Kardex;

import com.grupo2.tiendaConveniencia.repository.KardexRepository;

@RestController
@CrossOrigin
@RequestMapping("/kardex")
public class KardexService {
	
	@Autowired
	KardexRepository kardexRepository;
	
	
	@GetMapping(path = "/buscar")
	public List<Kardex> searchAll() {
		
		
		if(VariablesGlobales.idRolSesion.equals("admin")){
			try {
				run("set role administrador");
				
				VariablesGlobales.idRolSesion = "admin";
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		return kardexRepository.findAll();		
	}
	
	@GetMapping(path = "/buscar/producto/{producto}")
	public List<Kardex> searchProductoContaining(@PathVariable("producto") String producto) {
		
		
		if(VariablesGlobales.idRolSesion.equals("admin")){
			try {
				run("set role administrador");
				
				VariablesGlobales.idRolSesion = "admin";
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		return kardexRepository.findByProductoContaining(producto);		
	}
	
	@GetMapping(path = "/buscar/tienda/{tienda}")
	public List<Kardex> searchTiendaContaining(@PathVariable("tienda") String tienda) {
		
		if(VariablesGlobales.idRolSesion.equals("admin")){
			try {
				run("set role administrador");
				
				VariablesGlobales.idRolSesion = "admin";
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return kardexRepository.findByTiendaContaining(tienda);		
	}
	
	@GetMapping(path = "/buscar/tiendaproducto/{tienda}/{producto}")
	public List<Kardex> searchTiendaContainingAndProductoContaining(
			@PathVariable(name="tienda") String tienda,
			@PathVariable(name="producto") String producto) {
		
		if(VariablesGlobales.idRolSesion.equals("admin")){
			try {
				run("set role administrador");
				
				VariablesGlobales.idRolSesion = "admin";
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return kardexRepository.findByTiendaContainingAndProductoContaining(tienda,producto);		
	}
	
	 @Autowired
	    private JdbcTemplate jdbcTemplate;
	     
	    public void run(String sql) throws Exception {
	         
	       jdbcTemplate.execute(sql);	           
	       jdbcTemplate.execute("ALTER SESSION SET CURRENT_SCHEMA=C##TIENDA");      

	    }
	

}
