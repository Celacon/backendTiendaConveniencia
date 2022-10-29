package com.grupo2.tiendaConveniencia.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupo2.tiendaConveniencia.entity.Empleado;


@Repository("empleadoRepository")
public interface EmpleadoRepository extends JpaRepository <Empleado,Serializable> {
    
    
    public List<Empleado> findByIdEmpleado(Integer idEmpleado);
    

}
