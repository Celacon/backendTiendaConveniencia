package com.grupo2.tiendaConveniencia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupo2.tiendaConveniencia.VariablesGlobales;
import com.grupo2.tiendaConveniencia.entity.ViUbicacion;
import com.grupo2.tiendaConveniencia.repository.ViUbicacionRepository;

@RestController
@RequestMapping("/Viubicacion")
@CrossOrigin
public class ViUbicacionService {

	@Autowired
	ViUbicacionRepository viUbicacionRepository;
	
	@GetMapping(path = "/buscar")
	public List<ViUbicacion> buscar() {
		if (VariablesGlobales.idRolSesion.equals("encargado")) {
			try {
				run("set role encargado");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return viUbicacionRepository.findAll();
	}
	@Autowired
    private JdbcTemplate jdbcTemplate;
     
    public void run(String sql) throws Exception {
         
       jdbcTemplate.execute(sql);	           
       jdbcTemplate.execute("ALTER SESSION SET CURRENT_SCHEMA=C##TIENDA");      

    }
}
