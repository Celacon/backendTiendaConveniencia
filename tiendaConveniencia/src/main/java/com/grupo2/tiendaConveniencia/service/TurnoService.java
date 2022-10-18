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
import com.grupo2.tiendaConveniencia.entity.Turno;
import com.grupo2.tiendaConveniencia.repository.TurnoRepository;

@RestController
@RequestMapping("/turno")
@CrossOrigin
public class TurnoService {
	@Autowired
	TurnoRepository turnoRepository;
	
	@GetMapping (path= "/buscar")
	public List<Turno> buscar () {
		return turnoRepository.findAll();
	}
	@PostMapping (path= "/guardar")
	public Turno guardar (@RequestBody Turno turno) {
		turnoRepository.save(turno);
		return turno;
	}
	
	
	@DeleteMapping(path = "/eliminar/{idTurno}")
	public void eliminar(@PathVariable ("idTurno") Integer idTurno) {
		Optional<Turno> turno = turnoRepository.findById(idTurno);
		if (turno.isPresent()) {
			turnoRepository.delete(turno.get());
		}
	}
}
