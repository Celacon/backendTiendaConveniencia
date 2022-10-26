package com.grupo2.tiendaConveniencia.service;



import java.util.*;

import javax.crypto.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupo2.tiendaConveniencia.AesUtil;
import com.grupo2.tiendaConveniencia.VariablesGlobales;
import com.grupo2.tiendaConveniencia.entity.LoginFrm;
import com.grupo2.tiendaConveniencia.entity.Persona;
import com.grupo2.tiendaConveniencia.entity.Usuario;
import com.grupo2.tiendaConveniencia.repository.PersonaRepository;
import com.grupo2.tiendaConveniencia.repository.UsuarioRepository;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;




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
	
	 private final String key = "1234567890123456";
	    
	    public String encrypt(String toEncrypt) {
	        try {
	            IvParameterSpec iv = new IvParameterSpec(key.getBytes("UTF-8"));
	            SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");
	            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
	            cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);
	            byte[] encrypted = cipher.doFinal(toEncrypt.getBytes());
	            return new String(Base64.getEncoder().encode(encrypted));
	        } catch (Exception e) {
	            e.printStackTrace();
	            return null;
	        }
	    }

	    public String decrypt(String toDecrypt) {
	        try {
	            IvParameterSpec iv = new IvParameterSpec(key.getBytes("UTF-8"));
	            SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");
	            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
	            cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
	            byte[] cipherText = cipher.doFinal(Base64.getDecoder().decode(toDecrypt));
	            return new String(cipherText);
	        } catch (Exception e) {
	            e.printStackTrace();
	            return null;
	        }
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

		//List<Usuario> usuario = usuarioRepository.findByUsuarioAndClave(loginForm.getUsuario(), loginForm.getClave());
		List<Usuario> usuario = usuarioRepository.findByUsuario(loginForm.getUsuario());

		HashMap<String, String> usuarioIngresa = new HashMap<>();
				
		
		System.out.println(loginForm.getClave() + " es igual ? " +(decrypt(usuario.get(0).getClave())));
		
		if (!usuario.isEmpty() && loginForm.getClave().equals(decrypt(usuario.get(0).getClave())) ) {
			
			System.out.println(loginForm.getClave() + " entró con " +(decrypt(usuario.get(0).getClave())));
			
			Integer intIdPersona = usuario.get(0).getIdPersona();	
			
			List<Persona> persona = personaRepository.findByIdPersona(intIdPersona);
			
			String nombrePersona = persona.get(0).getPrimerNombre() + " " + persona.get(0).getPrimerApellido();
			
			
			String rol;

			
			
			usuarioIngresa.put("usuario", usuario.get(0).getUsuario()); //trae el id persona para obtener el nombre
			
			switch (usuario.get(0).getIdRol())
			{
				case 1: {
							rol = "admin"; 
							try {
								run("set role administrador");								
								VariablesGlobales.idRolSesion = "admin";
								//run("ALTER USER spring DEFAULT ROLE administrador");
								
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
						};
			}
			
			System.out.println(" desde el login var global .. " + VariablesGlobales.idRolSesion);
			
			usuarioIngresa.put("rol", rol);
			
			usuarioIngresa.put("nombreUsuario", nombrePersona);
			
			usuarioIngresa.put("idUsuario", usuario.get(0).getIdUsuario().toString());
			usuarioIngresa.put("idPersona", usuario.get(0).getIdPersona().toString());
			usuarioIngresa.put("idRol", usuario.get(0).getIdRol().toString());
		
			
		} else {
			usuarioIngresa.put("usuario", "noValido");
		}

		return usuarioIngresa;
	}
	
	
	 @Autowired
    private JdbcTemplate jdbcTemplate;
     
    public  void run(String sql) throws Exception {
         
       jdbcTemplate.execute(sql);	           
       jdbcTemplate.execute("ALTER SESSION SET CURRENT_SCHEMA=C##TIENDA");    

    }
    	 
   
	
	

}
