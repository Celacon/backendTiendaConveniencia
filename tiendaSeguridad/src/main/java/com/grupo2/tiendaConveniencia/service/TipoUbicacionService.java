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
import com.grupo2.tiendaConveniencia.entity.TipoUbicacion;
import com.grupo2.tiendaConveniencia.repository.TipoUbicacionRepository;

@RestController
@RequestMapping("/tipoUbicacion")
@CrossOrigin
public class TipoUbicacionService {

	@Autowired
	TipoUbicacionRepository tipoUbicacionRepository;
	
	@GetMapping(path = "/buscar")
	public List<TipoUbicacion> buscar() {
		if (VariablesGlobales.idRolSesion.equals("encargado")) {
			try {
				run("set role encargado");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return tipoUbicacionRepository.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public TipoUbicacion guardar (@RequestBody TipoUbicacion tipoUbicacion) {	
		tipoUbicacionRepository.save(tipoUbicacion);
		if (VariablesGlobales.idRolSesion.equals("encargado")) {
			try {
				run("set role encargado");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return tipoUbicacion;		
	}
	
	@DeleteMapping(path ="/eliminar/{idTipoUbicacion}")
	public void eliminar (@PathVariable("idTipoUbicacion") Integer idTipoUbicacion) {
		Optional<TipoUbicacion>tipoUbicacion = tipoUbicacionRepository.findById(idTipoUbicacion);
		if (VariablesGlobales.idRolSesion.equals("encargado")) {
			try {
				run("set role encargado");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(tipoUbicacion.isPresent()) {
			tipoUbicacionRepository.delete(tipoUbicacion.get());
		}
	
}
	 @Autowired
	    private JdbcTemplate jdbcTemplate;
	     
	    public void run(String sql) throws Exception {
	         
	       jdbcTemplate.execute(sql);	           
	       jdbcTemplate.execute("ALTER SESSION SET CURRENT_SCHEMA=C##TIENDA");      

	    }

}
