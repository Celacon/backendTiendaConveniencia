package com.grupo2.tiendaConveniencia.repository;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupo2.tiendaConveniencia.entity.TurnoTienda;



@Repository("turnoTiendaRepository")
public interface TurnoTiendaRepository extends JpaRepository<TurnoTienda, Serializable>{
	public Optional<TurnoTienda> findByIdTiendaAndIdTurno(Integer idTienda,Integer idTurno);
}
