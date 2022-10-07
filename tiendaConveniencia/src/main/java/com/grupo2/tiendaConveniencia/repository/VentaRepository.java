package com.grupo2.tiendaConveniencia.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupo2.tiendaConveniencia.entity.Venta;

@Repository("ventaRepository")

public interface VentaRepository extends JpaRepository<Venta, Serializable> {

}
