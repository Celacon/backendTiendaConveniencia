package com.grupo2.tiendaConveniencia.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Sort;
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
import com.grupo2.tiendaConveniencia.entity.Persona;

import com.grupo2.tiendaConveniencia.repository.PersonaRepository;


@RestController
@RequestMapping("/persona")
@CrossOrigin
public class PersonaService {
	
	@Autowired	
	PersonaRepository personaRepository;
	
	@Value("${rolUsuarioLogueado}")
    public String rolUsrLog;
	
	@GetMapping(path = "/buscar")
	public List<Persona> buscar() {
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
	    
        
		return personaRepository.findAll(Sort.by(Sort.Direction.DESC,"idPersona"));
	}

	
	@GetMapping(path = "/buscar/{idpersona}")
	public List<Persona> buscarPorIdpersona(@PathVariable("idpersona") Integer idPersona) {
	    
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
        
	    
		return personaRepository.findByIdPersona(idPersona);
	}
	

	
	
	@PostMapping(path = "/guardar")
	public Persona guardar (@RequestBody Persona persona) {	
	    System.out.println(VariablesGlobales.idRolSesion);
	    
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
        
	    
		personaRepository.save(persona);;
		return persona;		
	}
	
	
	@DeleteMapping(path = "/eliminar/{idPersona}")
	public void eliminar(@PathVariable ("idPersona") Integer idPersona) {
	    
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
        
	    
		Optional<Persona> persona = personaRepository.findById(idPersona);
		if (persona.isPresent()) {
			personaRepository.delete(persona.get());
		}
	}
	@Autowired
    private JdbcTemplate jdbcTemplate;
     
    public void run(String sql) throws Exception {
         
       jdbcTemplate.execute(sql);              
       jdbcTemplate.execute("ALTER SESSION SET CURRENT_SCHEMA=C##TIENDA");      

    }
	

}