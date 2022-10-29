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
import com.grupo2.tiendaConveniencia.entity.Presentacion;


import com.grupo2.tiendaConveniencia.repository.PresentacionRepository;




@RestController
@RequestMapping("/presentacion")
@CrossOrigin
public class PresentacionService {
	
	@Autowired	
	PresentacionRepository presentacionRepository;
	
	@GetMapping(path = "/buscar")
	public List<Presentacion> buscar() {
		if (VariablesGlobales.idRolSesion.equals("encargado")) {
			try {
				run("set role encargado");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return presentacionRepository.findAll();
	}

	
	@PostMapping(path = "/guardar")
	public Presentacion guardar (@RequestBody Presentacion presentacion) {	
		presentacionRepository.save(presentacion);
		if (VariablesGlobales.idRolSesion.equals("encargado")) {
			try {
				run("set role encargado");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return presentacion;		
	}
	
	@DeleteMapping(path ="/eliminar/{idPresentacion}")
	public void eliminar (@PathVariable("idPresentacion") Integer idPresentacion) {
		Optional<Presentacion>presentacion = presentacionRepository.findById(idPresentacion);
		if (VariablesGlobales.idRolSesion.equals("encargado")) {
			try {
				run("set role encargado");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(presentacion.isPresent()) {
			presentacionRepository.delete(presentacion.get());
		}
	}
	@Autowired
    private JdbcTemplate jdbcTemplate;
     
    public void run(String sql) throws Exception {
         
       jdbcTemplate.execute(sql);	           
       jdbcTemplate.execute("ALTER SESSION SET CURRENT_SCHEMA=C##TIENDA");      

    }
}


