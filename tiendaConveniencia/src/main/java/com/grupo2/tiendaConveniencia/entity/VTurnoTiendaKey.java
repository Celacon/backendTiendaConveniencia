package com.grupo2.tiendaConveniencia.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;


public class VTurnoTiendaKey implements Serializable{
    
    private static final long serialVersionUID = -523211111111113338L; 
    

    @Column(name = "ID_TIENDA")
    private Integer idTienda;
 
    
    @Column(name = "ID_TURNO")
    private Integer idTurno;


    @Override
    public int hashCode() {
        return Objects.hash(idTienda, idTurno);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        VTurnoTiendaKey other = (VTurnoTiendaKey) obj;
        return Objects.equals(idTienda, other.idTienda) && Objects.equals(idTurno, other.idTurno);
    }


    public VTurnoTiendaKey() {
        super();
    }


 

    
    
}
