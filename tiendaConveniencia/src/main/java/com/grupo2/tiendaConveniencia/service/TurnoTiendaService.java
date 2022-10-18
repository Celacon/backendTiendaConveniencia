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

import com.grupo2.tiendaConveniencia.entity.TurnoTienda;
import com.grupo2.tiendaConveniencia.repository.TurnoTiendaRepository;

@RestController
@RequestMapping("/turnoTienda")
@CrossOrigin
public class TurnoTiendaService {

	@Autowired 
	TurnoTiendaRepository turnoTiendaRepository;

	@GetMapping (path= "/buscar")
	public List<TurnoTienda> buscar(){
		
		return turnoTiendaRepository.findAll();
	}	

	@PostMapping (path= "/guardar")
	public TurnoTienda guardar (@RequestBody TurnoTienda turnoTienda) {
		turnoTiendaRepository.save(turnoTienda);
		return turnoTienda;
	}
	
	@DeleteMapping(path = "/eliminar/{idTurno}")
	public void eliminar(@PathVariable ("idTurno") Integer idTurno) {
		Optional<TurnoTienda> turnoTienda= turnoTiendaRepository.findById(idTurno);
		if (turnoTienda.isPresent()) {
			turnoTiendaRepository.delete(turnoTienda.get());
		}
	}
}
