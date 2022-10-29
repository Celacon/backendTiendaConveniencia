package com.grupo2.tiendaConveniencia.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupo2.tiendaConveniencia.entity.Kardex;


@Repository("kardexRepository")
public interface KardexRepository extends JpaRepository<Kardex, Serializable> {
	
	public List<Kardex> findByProductoContaining(String producto);
	public List<Kardex> findByTiendaContaining(String tienda);
	public List<Kardex> findByTiendaContainingAndProductoContaining(String tienda, String producto);
	
}
