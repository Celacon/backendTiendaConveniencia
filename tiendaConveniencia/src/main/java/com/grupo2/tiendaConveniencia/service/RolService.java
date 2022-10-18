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
import com.grupo2.tiendaConveniencia.entity.Rol;
import com.grupo2.tiendaConveniencia.repository.RolRepository;

@RestController
@RequestMapping("/rol")
@CrossOrigin
public class RolService {
	@Autowired
	RolRepository rolRepository;
	
	
	@GetMapping(path = "/buscar")
	public List<Rol> buscar() {
		return rolRepository.findAll();
	}

	
	@PostMapping(path = "/guardar")
	public Rol guardar (@RequestBody Rol rol) {	
		rolRepository.save(rol);;
		return rol;		
	}
	
	
	@DeleteMapping(path = "/eliminar/{idRol}")
	public void eliminar(@PathVariable ("idRol") Integer idRol) {
		Optional<Rol> rol = rolRepository.findById(idRol);
		if (rol.isPresent()) {
			rolRepository.delete(rol.get());
		}
	}
}
