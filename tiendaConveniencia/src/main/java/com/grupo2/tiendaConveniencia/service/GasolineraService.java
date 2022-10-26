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

import com.grupo2.tiendaConveniencia.entity.Gasolinera;
import com.grupo2.tiendaConveniencia.repository.GasolineraRepository;
import com.grupo2.tiendaConveniencia.repository.TiendaRepository;

@RestController
@RequestMapping("/gasolinera")
@CrossOrigin
public class GasolineraService {
	@Autowired
	GasolineraRepository gasolineraRepository;
	
	@Autowired
	TiendaRepository tiendaRepository;
	
	@GetMapping(path = "/buscar")
	public List<Gasolinera>buscar(){
		return gasolineraRepository.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Gasolinera guardar (@RequestBody Gasolinera gasolinera) {
		gasolineraRepository.save(gasolinera);
		return gasolinera;
	}

	@DeleteMapping(path ="/eliminar/{id_gasolinera}")
	public void eliminar (@PathVariable("id_gasolinera") Integer idGasolinera) {
		Optional<Gasolinera>gasolinera = gasolineraRepository.findById(idGasolinera);
		gasolineraRepository.delete(gasolinera.get());
		System.out.print("Registro eliminado. Codigo ----" + idGasolinera);

	}


}
