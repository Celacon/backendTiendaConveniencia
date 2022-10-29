package com.grupo2.tiendaConveniencia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupo2.tiendaConveniencia.VariablesGlobales;

import com.grupo2.tiendaConveniencia.entity.VEmpleadosNoAsignados;

import com.grupo2.tiendaConveniencia.repository.VEmpleadosNoAsignadosRepository;



@RestController
@RequestMapping("/vEmpleadosNoAsignados")
@CrossOrigin
public class VEmpleadosNoAsignadosService {
    
    @Autowired
    VEmpleadosNoAsignadosRepository vEmpleadosNoAsignadosRepository;
    @Value("${rolUsuarioLogueado}")
    public String rolUsrLog;
    
    

    @GetMapping(path = "/buscar")
    public List<VEmpleadosNoAsignados> buscar() {
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
        
        
        return vEmpleadosNoAsignadosRepository.findAll();
    }
    
    
    @Autowired
    private JdbcTemplate jdbcTemplate;
     
    public void run(String sql) throws Exception {
         
       jdbcTemplate.execute(sql);              
       jdbcTemplate.execute("ALTER SESSION SET CURRENT_SCHEMA=C##TIENDA");      

    }
  

}
