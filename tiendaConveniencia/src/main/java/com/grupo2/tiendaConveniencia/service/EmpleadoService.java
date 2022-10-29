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
import com.grupo2.tiendaConveniencia.entity.Empleado;
import com.grupo2.tiendaConveniencia.entity.Persona;
import com.grupo2.tiendaConveniencia.repository.EmpleadoRepository;
import com.grupo2.tiendaConveniencia.repository.PersonaRepository;

@RestController
@RequestMapping("/empleado")
@CrossOrigin
public class EmpleadoService {
	@Autowired
	EmpleadoRepository empleadoRepository;
	
	@Autowired
	PersonaRepository personaRepository;
	
	@Value("${rolUsuarioLogueado}")
    public String rolUsrLog;
	
	@GetMapping(path = "/buscar")
	public List<Empleado> buscar() {
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
            System.out.print("holaaaaaa");
            try {
                run("set role vendedor");
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
	    
		return empleadoRepository.findAll();
	}

	
	@PostMapping(path = "/guardar")
	public Empleado guardar (@RequestBody Empleado empleado) {	
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
	    Persona persona = empleado.getPersona();

		//empleado.setPersona(null);
		personaRepository.save(persona);
		//System.out.print(persona.getIdPersona());
		empleado.setIdPersonae(persona.getIdPersona());	

		empleadoRepository.save(empleado);
		return empleado;		
	}
	
	
	@GetMapping(path = {"/buscar/por/{idEmpleado}"}) 
    public List<Empleado> buscarPor(@PathVariable Integer idEmpleado) {
	    
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
	    
	    
	    
        return empleadoRepository.findByIdEmpleado(idEmpleado); 
    }
	
	
	
	

	@DeleteMapping(path = "/eliminar/{idEmpleado}")
	public void eliminar(@PathVariable ("idEmpleado") Integer idEmpleado) {
	    
	    
	    
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
	    
		Optional<Empleado> empleado = empleadoRepository.findById(idEmpleado);
		if (empleado.isPresent()) {
			empleadoRepository.delete(empleado.get());
		}
	}
	
	
	 @Autowired
     private JdbcTemplate jdbcTemplate;
      
     public void run(String sql) throws Exception {
          
        jdbcTemplate.execute(sql);              
        jdbcTemplate.execute("ALTER SESSION SET CURRENT_SCHEMA=C##TIENDA");      

     }
	
}
