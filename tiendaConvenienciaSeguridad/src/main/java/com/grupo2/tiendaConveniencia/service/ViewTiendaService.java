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
import com.grupo2.tiendaConveniencia.entity.ViewTienda;
import com.grupo2.tiendaConveniencia.repository.ViewTiendaRepository;

@RestController
@RequestMapping("/viewtienda")
@CrossOrigin

public class ViewTiendaService {
	
	@Autowired
	ViewTiendaRepository viewTiendaRepository;
	
	@GetMapping(path = "/buscar")
	public List<ViewTienda>buscar(){
		if (VariablesGlobales.idRolSesion.equals("encargado")) {
			try {
				run("set role encargado");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return viewTiendaRepository.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public ViewTienda guardar (@RequestBody ViewTienda viewtienda) {
		viewTiendaRepository.save(viewtienda);
		return viewtienda;
	}

	@DeleteMapping(path ="/eliminar/{id_tienda}")
	public void eliminar (@PathVariable("id_tienda") Integer idTienda) {
		Optional<ViewTienda>viewtienda = viewTiendaRepository.findById(idTienda);
		viewTiendaRepository.delete(viewtienda.get());
		System.out.print("Registro eliminado. Codigo ----" + idTienda);

	}
	
	 @Autowired
	    private JdbcTemplate jdbcTemplate;
	     
	    public void run(String sql) throws Exception {
	         
	       jdbcTemplate.execute(sql);	           
	       jdbcTemplate.execute("ALTER SESSION SET CURRENT_SCHEMA=C##TIENDA");      

	    }
}
