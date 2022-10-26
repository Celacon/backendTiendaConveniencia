package com.grupo2.tiendaConveniencia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
@Service
public class  VariablesGlobales {
	

	
 public static String idRolSesion = "none";
 
 @Autowired
 private static JdbcTemplate jdbcTemplate;
 
 public static void run(String sql) throws Exception {
     
     jdbcTemplate.execute(sql);	           
     jdbcTemplate.execute("ALTER SESSION SET CURRENT_SCHEMA=C##TIENDA");      

  }
 
 public static void adminRoles (String rolLogueado){
   	 
   	 System.out.println("desde el método global .. " + rolLogueado);
   	 
   	
   	  
   	 switch (rolLogueado)
   		{
   			case "admin": {
   						try {
   							run("set role administrador");
   							
   							VariablesGlobales.idRolSesion = "admin";
   							
   							
   						} catch (Exception e) {
   							// TODO Auto-generated catch block
   							e.printStackTrace();
   						}
   						
   						break;
   					}
   			case "encargado": {
   						
   						VariablesGlobales.idRolSesion = "encargado";
   						
   						
   						try {
   							run("SET ROLE encargado");
   						} catch (Exception e) {
   							// TODO Auto-generated catch block
   							e.printStackTrace();
   						}
   						
   						break;								
   		
   					}
   			case "cajero": {
   						
   													
   						try {
   							run("SET ROLE vendedor");
   							
   						} catch (Exception e) {
   							// TODO Auto-generated catch block
   							e.printStackTrace();
   						}
   						
   						break;							

   					}
   			case "ecommerce": {
   						 
   						try {
   							run("SET ROLE ecommerce");
   						
   						} catch (Exception e) {
   							// TODO Auto-generated catch block
   							e.printStackTrace();
   						}
   						break;
   						
   					}
   			default: 
   					VariablesGlobales.idRolSesion = "none";		
   					try {
   						run("set role USUARIO_CONEXION");
   						
   						VariablesGlobales.idRolSesion = "admin";
   						
   					} catch (Exception e) {
   						// TODO Auto-generated catch block
   						e.printStackTrace();
   					}
   			;
   		}
    }

}
