package com.grupo2.tiendaConveniencia.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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

import com.grupo2.tiendaConveniencia.entity.Status;
import com.grupo2.tiendaConveniencia.repository.StatusRepository;


@RestController
@RequestMapping("/status")
@CrossOrigin
public class StatusService {
	@Autowired
	StatusRepository statusRepository;
	
	   @Value("${rolUsuarioLogueado}")
	    public String rolUsrLog;
	
	@GetMapping(path = "/buscar")
	public List<Status> buscar() {
	    
	    if (VariablesGlobales.idRolSesion.equals("admin")) {
            try {
                run("set role administrador");
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }else   if (VariablesGlobales.idRolSesion.equals("encargado")) {
            try {
                run("set role encargado");
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }else   if (VariablesGlobales.idRolSesion.equals("cajero")) {
            try {
                run("set role vendedor");
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
	    
		return statusRepository.findAll();
	}

	
	@PostMapping(path = "/guardar")
	public Status guardar (@RequestBody Status status) {	
	    
	    if (VariablesGlobales.idRolSesion.equals("admin")) {
            try {
                run("set role administrador");
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }else   if (VariablesGlobales.idRolSesion.equals("encargado")) {
            try {
                run("set role encargado");
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }else   if (VariablesGlobales.idRolSesion.equals("cajero")) {
            try {
                run("set role vendedor");
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
	    
		statusRepository.save(status);;
		return status;		
	}
	
	
	   @DeleteMapping(path = "/eliminar/{idStatus}")
	    public void eliminar(@PathVariable ("idStatus") Integer idStatus) {
	        
	        if (VariablesGlobales.idRolSesion.equals("admin")) {
	            try {
	                run("set role administrador");
	            } catch (Exception e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }
	        }else   if (VariablesGlobales.idRolSesion.equals("encargado")) {
	            try {
	                run("set role encargado");
	            } catch (Exception e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }
	        }else   if (VariablesGlobales.idRolSesion.equals("cajero")) {
	            try {
	                run("set role vendedor");
	            } catch (Exception e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }
	        }
	        
	        Optional<Status> status = statusRepository.findById(idStatus);
	        if (status.isPresent()) {
	            statusRepository.delete(status.get());
	        }
	    }
	   @Autowired
	     private JdbcTemplate jdbcTemplate;
	      
	     public void run(String sql) throws Exception {
	          
	        jdbcTemplate.execute(sql);              
	        jdbcTemplate.execute("ALTER SESSION SET CURRENT_SCHEMA=C##TIENDA");      

	     }
	
	

}
