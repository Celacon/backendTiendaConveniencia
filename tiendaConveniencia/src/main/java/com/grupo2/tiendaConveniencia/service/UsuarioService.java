package com.grupo2.tiendaConveniencia.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.grupo2.tiendaConveniencia.entity.Usuario;
import com.grupo2.tiendaConveniencia.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuario")
@CrossOrigin
public class UsuarioService {
	@Autowired
	UsuarioRepository usuarioRepository;

@GetMapping(path = "/buscar")
public List<Usuario> buscar(){
	
	return usuarioRepository.findAll();
}

@PostMapping(path= "/guardar")
public Usuario guardar (@RequestBody Usuario usuario) {
	usuarioRepository.save(usuario);
	return usuario;
}


@DeleteMapping(path = "/eliminar/{idUsuario}")
public void eliminar(@PathVariable ("idUsuario") Integer idUsuario) {
	Optional<Usuario> usuario = usuarioRepository.findById(idUsuario);
	if (usuario.isPresent()) {
		usuarioRepository.delete(usuario.get());
	}
}
}
