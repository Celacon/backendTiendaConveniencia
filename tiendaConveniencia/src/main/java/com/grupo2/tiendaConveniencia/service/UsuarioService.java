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
import com.grupo2.tiendaConveniencia.entity.Usuario;

import com.grupo2.tiendaConveniencia.repository.UsuarioRepository;



@RestController
@CrossOrigin
@RequestMapping("/usuario")

public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	
	@Value("${rolUsuarioLogueado}")
	public String rolUsrLog;

	//Service #7: Search for all users in the table
	@GetMapping(path = "/buscar")
	public List<Usuario> search() {
		return usuarioRepository.findAll();		
	}
	
	//Search for user information
			@GetMapping(path = "/bsucar/{usuario}")
			public List<Usuario> searhStudentProfile(@PathVariable("usuario") String usuario) {
				return usuarioRepository.findByUsuario(usuario);		
			}
	
	
	//Service #8: Save/Update user
	@PostMapping (path = "/grabar")
	public Usuario grabar (@RequestBody Usuario usuario) {
		
		if (VariablesGlobales.idRolSesion.equals("admin")) {
			try {
				run("set role administrador");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		usuarioRepository.save(usuario);
		return usuario;
	}
	
	//Service #9: Delete user
	@DeleteMapping (path="/borrar/{idusuario}")
	public void borrar (@PathVariable("idusuario") Integer idusuario) {
		Optional<Usuario> usuario = usuarioRepository.findById(idusuario);
		if (usuario.isPresent()) {
			usuarioRepository.delete(usuario.get());
		}
	}
	
	 @Autowired
	    private JdbcTemplate jdbcTemplate;
	     
	    public void run(String sql) throws Exception {
	         
	       jdbcTemplate.execute(sql);	           
	       jdbcTemplate.execute("ALTER SESSION SET CURRENT_SCHEMA=C##TIENDA");      

	    }
		
}
