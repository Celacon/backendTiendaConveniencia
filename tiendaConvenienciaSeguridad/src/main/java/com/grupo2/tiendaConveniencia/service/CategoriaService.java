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
import com.grupo2.tiendaConveniencia.entity.Categoria;

import com.grupo2.tiendaConveniencia.repository.CategoriaRepository;

@RestController
@RequestMapping("/categoria")
@CrossOrigin
public class CategoriaService {
	
	@Autowired
	CategoriaRepository categoriaRepository;
	
	
	@GetMapping(path = "/buscar")
	public List<Categoria> buscar() {
		if (VariablesGlobales.idRolSesion.equals("encargado")) {
			try {
				run("set role encargado");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return categoriaRepository.findAll();
	}

	
	@PostMapping(path = "/guardar")
	public Categoria guardar (@RequestBody Categoria categoria) {
		
		if (VariablesGlobales.idRolSesion.equals("encargado")) {
			try {
				run("set role encargado");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		categoriaRepository.save(categoria);
		return categoria;		
	}
	
	@DeleteMapping(path ="/eliminar/{id_categoria}")
	public void eliminar (@PathVariable("id_categoria") Integer idCategoria) {
		
		if (VariablesGlobales.idRolSesion.equals("encargado")) {
			try {
				run("set role encargado");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Optional<Categoria>categoria = categoriaRepository.findById(idCategoria);
		categoriaRepository.delete(categoria.get());
		System.out.print("Registro eliminado. Codigo ----" + idCategoria);
		
	}
	
	 @Autowired
	    private JdbcTemplate jdbcTemplate;
	     
	    public void run(String sql) throws Exception {
	         
	       jdbcTemplate.execute(sql);	           
	       jdbcTemplate.execute("ALTER SESSION SET CURRENT_SCHEMA=C##TIENDA");      

	    }
	
}
