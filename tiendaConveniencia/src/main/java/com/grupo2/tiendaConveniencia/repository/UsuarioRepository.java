package com.grupo2.tiendaConveniencia.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupo2.tiendaConveniencia.entity.Usuario;

@Repository("usuarioRepository")
public interface UsuarioRepository extends JpaRepository<Usuario, Serializable>{
	
	public List<Usuario> findByUsuarioAndClave(String usuario, String clave);	
	public List<Usuario> findByUsuario(String usuario);

}



