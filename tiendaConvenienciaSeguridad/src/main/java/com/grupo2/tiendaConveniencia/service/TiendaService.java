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
import com.grupo2.tiendaConveniencia.entity.Tienda;
import com.grupo2.tiendaConveniencia.repository.TiendaRepository;

@RestController
@RequestMapping("/tienda")
@CrossOrigin

public class TiendaService {

	@Autowired
	TiendaRepository tiendaRepository;
	
	
	@GetMapping(path = "/buscar")
	public List<Tienda>buscar(){
		if (VariablesGlobales.idRolSesion.equals("admin")) {
			try {
				run("set role administrador");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return tiendaRepository.findAll();
	}
	
	
	@PostMapping(path = "/guardar")
	public Tienda guardar (@RequestBody Tienda tienda) {
		
		if (VariablesGlobales.idRolSesion.equals("admin")) {
			try {
				run("set role administrador");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		tiendaRepository.save(tienda);
		return tienda;
	}
	
	@DeleteMapping(path = "/eliminar/{id_tienda}")
	public void eliminar (@PathVariable("id_tienda") Integer idTienda) {
		Optional<Tienda>tienda = tiendaRepository.findById(idTienda);
		tiendaRepository.delete(tienda.get());
		System.out.print("Registro eliminado. Codigo ----" + idTienda);

	}
	 @Autowired
	    private JdbcTemplate jdbcTemplate;
	     
	    public void run(String sql) throws Exception {
	         
	       jdbcTemplate.execute(sql);	           
	       jdbcTemplate.execute("ALTER SESSION SET CURRENT_SCHEMA=C##TIENDA");      

	    }
}
