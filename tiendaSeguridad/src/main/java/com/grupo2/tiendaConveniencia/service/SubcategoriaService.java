package com.grupo2.tiendaConveniencia.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.grupo2.tiendaConveniencia.entity.Subcategoria;
import com.grupo2.tiendaConveniencia.repository.SubcategoriaRepository;

@RestController
@RequestMapping("/subcategoria")
@CrossOrigin
public class SubcategoriaService {
	@Autowired
	SubcategoriaRepository subcategoriaRepository;
	
	@GetMapping(path = "/buscar")
	public List<Subcategoria> buscar() {
		if (VariablesGlobales.idRolSesion.equals("encargado")) {
			try {
				run("set role encargado");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return subcategoriaRepository.findAll();
	}

	
	@PostMapping(path = "/guardar")
	public Subcategoria guardar (@RequestBody Subcategoria subcategoria) {	
		subcategoriaRepository.save(subcategoria);
		if (VariablesGlobales.idRolSesion.equals("encargado")) {
			try {
				run("set role encargado");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return subcategoria;		
	}
	
	@DeleteMapping(path ="/eliminar/{idSubcategoria}")
	public void eliminar (@PathVariable("idSubcategoria") Integer idSubcategoria) {
		Optional<Subcategoria>subCategoria = subcategoriaRepository.findById(idSubcategoria);
		if (VariablesGlobales.idRolSesion.equals("encargado")) {
			try {
				run("set role encargado");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(subCategoria.isPresent()) {
			subcategoriaRepository.delete(subCategoria.get());
		}
	}
	@Autowired
    private JdbcTemplate jdbcTemplate;
     
    public void run(String sql) throws Exception {
         
       jdbcTemplate.execute(sql);	           
       jdbcTemplate.execute("ALTER SESSION SET CURRENT_SCHEMA=C##TIENDA");      

    }
}
