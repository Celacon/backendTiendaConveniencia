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


import com.grupo2.tiendaConveniencia.entity.TurnoTiendaEmpleado;
import com.grupo2.tiendaConveniencia.repository.TurnoTiendaEmpleadoRepository;

@RestController
@RequestMapping("/turnoTiendaEmpleado")
@CrossOrigin
public class TurnoTiendaEmpleadoService {
@Autowired 
TurnoTiendaEmpleadoRepository turnoTiendaEmpleadoRepository;

@GetMapping (path= "/buscar")
public List<TurnoTiendaEmpleado> buscar(){
	
	return turnoTiendaEmpleadoRepository.findAll();
}

@PostMapping (path= "/guardar")
public TurnoTiendaEmpleado guardar (@RequestBody TurnoTiendaEmpleado turnoTiendaEmpleado) {
	turnoTiendaEmpleadoRepository.save(turnoTiendaEmpleado);
	return turnoTiendaEmpleado;
}


@DeleteMapping(path = "/eliminar/{idTienda}")
public void eliminar(@PathVariable ("idTienda") Integer idTienda) {
	Optional<TurnoTiendaEmpleado> turnoTiendaEmpleado = turnoTiendaEmpleadoRepository.findById(idTienda);
	if (turnoTiendaEmpleado.isPresent()) {
		turnoTiendaEmpleadoRepository.delete(turnoTiendaEmpleado.get());
	}
}

}
