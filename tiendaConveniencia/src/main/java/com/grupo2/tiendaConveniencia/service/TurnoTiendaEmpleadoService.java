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
import com.grupo2.tiendaConveniencia.entity.TurnoTiendaEmpleado;
import com.grupo2.tiendaConveniencia.repository.TurnoTiendaEmpleadoRepository;

@RestController
@RequestMapping("/turnoTiendaEmpleado")
@CrossOrigin
public class TurnoTiendaEmpleadoService {
@Autowired 
TurnoTiendaEmpleadoRepository turnoTiendaEmpleadoRepository;

@Value("${rolUsuarioLogueado}")
public String rolUsrLog;

@GetMapping (path= "/buscar")
public List<TurnoTiendaEmpleado> buscar(){
    
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
	
	return turnoTiendaEmpleadoRepository.findAll();
}

@PostMapping (path= "/guardar")
public TurnoTiendaEmpleado guardar (@RequestBody TurnoTiendaEmpleado turnoTiendaEmpleado) {
    
    if (VariablesGlobales.idRolSesion.equals("admin")) {
        try {
            run("set role administrador");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }else   if (VariablesGlobales.idRolSesion.equals("encargado")) {
        
        System.out.println("hola"+VariablesGlobales.idRolSesion);
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
    
	turnoTiendaEmpleadoRepository.save(turnoTiendaEmpleado);
	return turnoTiendaEmpleado;
}

@GetMapping(path = {"/buscar/por/{idEmpleado}"}) 
public List<TurnoTiendaEmpleado> buscarPor(@PathVariable Integer idEmpleado) {
    
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
    
    
    
    return turnoTiendaEmpleadoRepository.findByIdEmpleado(idEmpleado); 
}






@DeleteMapping(path = "/eliminar/{idTienda}/{idTurno}/{idEmpleado}")
public void eliminar(
		@PathVariable ("idTienda") Integer idTienda,
		@PathVariable ("idTurno") Integer idTurno,
		@PathVariable ("idEmpleado") Integer idEmpleado) {
    
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
	
	Optional<TurnoTiendaEmpleado> turnoTiendaEmpleado = 
	        turnoTiendaEmpleadoRepository.findByIdTiendaAndIdTurnoAndIdEmpleado(idTienda,idTurno, idEmpleado);
	if (turnoTiendaEmpleado.isPresent()) {
		turnoTiendaEmpleadoRepository.delete(turnoTiendaEmpleado.get());
	}
}

@Autowired
private JdbcTemplate jdbcTemplate;
 
public void run(String sql) throws Exception {
     
   jdbcTemplate.execute(sql);              
   jdbcTemplate.execute("ALTER SESSION SET CURRENT_SCHEMA=C##TIENDA");      

}


}
