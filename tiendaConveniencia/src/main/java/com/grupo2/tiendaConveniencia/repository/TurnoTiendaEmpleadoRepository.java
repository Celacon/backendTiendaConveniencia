package com.grupo2.tiendaConveniencia.repository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.grupo2.tiendaConveniencia.entity.TurnoTiendaEmpleado;


@Repository("turnoTiendaEmpleadoRepository") 
public interface TurnoTiendaEmpleadoRepository extends JpaRepository<TurnoTiendaEmpleado, Serializable> {
	public Optional<TurnoTiendaEmpleado> findByIdTiendaAndIdTurnoAndIdEmpleado(Integer idTienda,Integer idTurno,Integer idEmpleado );
	
    public List<TurnoTiendaEmpleado> findByIdEmpleado(Integer idEmpleado);
    
}
