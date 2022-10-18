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

import com.grupo2.tiendaConveniencia.entity.TipoDocumento;

import com.grupo2.tiendaConveniencia.repository.TipoDocumentoRepository;

@RestController
@RequestMapping("/tipoDocumento")
@CrossOrigin
public class TipoDocumentoService {
	@Autowired
	TipoDocumentoRepository tipoDocumentoRepository;
	
	
	@GetMapping (path= "/buscar")
	public List<TipoDocumento> buscar () {
		return tipoDocumentoRepository.findAll();
	}
	@PostMapping (path= "/guardar")
	public TipoDocumento guardar (@RequestBody TipoDocumento tipoDocumento) {
		tipoDocumentoRepository.save(tipoDocumento);
		return tipoDocumento;
	}

	@DeleteMapping(path = "/eliminar/{idTipoDocumento}")
	public void eliminar(@PathVariable ("idTipoDocumento") Integer idTipoDocumento) {
		Optional<TipoDocumento> tipoDocumento = tipoDocumentoRepository.findById(idTipoDocumento);
		if (tipoDocumento.isPresent()) {
			tipoDocumentoRepository.delete(tipoDocumento.get());
		}
	}
}
