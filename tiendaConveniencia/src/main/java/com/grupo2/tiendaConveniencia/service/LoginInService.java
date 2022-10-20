package com.grupo2.tiendaConveniencia.service;



import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupo2.tiendaConveniencia.VariablesGlobales;
import com.grupo2.tiendaConveniencia.entity.LoginFrm;
import com.grupo2.tiendaConveniencia.entity.Persona;
import com.grupo2.tiendaConveniencia.entity.Usuario;
import com.grupo2.tiendaConveniencia.repository.PersonaRepository;
import com.grupo2.tiendaConveniencia.repository.UsuarioRepository;


@RestController
@CrossOrigin
@RequestMapping("/signin")
public class LoginInService {

	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Autowired
	PersonaRepository personaRepository;
	
	
	
	public static  Usuario usuarioLogged() {
		final Usuario loggedusr = new Usuario();
        return loggedusr;
    }
	
	//Service #18: login validation with DSL
	@PostMapping(path = "/login")
	public HashMap<String, String> validation (@RequestBody LoginFrm loginForm) {
		
		try {
					
			run("set role USUARIO_CONEXION");
			VariablesGlobales.idRolSesion = "none";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		List<Usuario> usuario = usuarioRepository.findByUsuarioAndClave(loginForm.getUsuario(), loginForm.getClave());
		
		
		
		
		Integer intIdPersona = usuario.get(0).getIdPersona();	
				
		List<Persona> persona = personaRepository.findByIdPersona(intIdPersona);
		
		
		String nombrePersona = persona.get(0).getPrimerNombre() + " " + persona.get(0).getPrimerApellido();
		
		HashMap<String, String> usuarioIngresa = new HashMap<>();
		String rol;

		if (!usuario.isEmpty()) {
			
			usuarioIngresa.put("usuario", usuario.get(0).getUsuario()); //trae el id persona para obtener el nombre
			
			switch (usuario.get(0).getIdRol())
			{
				case 1: {
							rol = "admin"; 
							try {
								run("set role administrador");
								
								VariablesGlobales.idRolSesion = "admin";
								
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
							break;
						}
				case 2: {
							rol = "encargado";
							VariablesGlobales.idRolSesion = "encargado";
							
							try {
								run("SET ROLE encargado");
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
							break;								
							
							
							
						}
				case 3: {
							rol = "cajero";
														
							try {
								run("SET ROLE vendedor");
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
							break;							

						}
				case 4: {
							rol = "ecommerce"; 
							try {
								run("SET ROLE ecommerce");
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							break;
							
						}
				default: rol = "none";
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
			usuarioIngresa.put("rol", rol);
			
			usuarioIngresa.put("nombreUsuario", nombrePersona);
		

		} else {
			usuarioIngresa.put("usuario", "noValido");
		}

		return usuarioIngresa;
	}
	
	
	 @Autowired
    private JdbcTemplate jdbcTemplate;
     
    public void run(String sql) throws Exception {
         
       jdbcTemplate.execute(sql);	           
       jdbcTemplate.execute("ALTER SESSION SET CURRENT_SCHEMA=C##TIENDA");      

    }
	
	

}
