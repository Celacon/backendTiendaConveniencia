package com.grupo2.tiendaConveniencia.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Basic;
import javax.persistence.Column;

public class TurnoTiendaKey implements Serializable{
    private static final long serialVersionUID = -5232222222222222228L; 
    
    @Basic(optional = false)
    @Column(name = "ID_TURNO")
    private Integer idTurno;
        
    @Column(name = "ID_TIENDA")
    private Integer idTienda;

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
        TurnoTiendaKey other = (TurnoTiendaKey) obj;
        return Objects.equals(idTienda, other.idTienda) && Objects.equals(idTurno, other.idTurno);
    }

    public TurnoTiendaKey() {
        super();
    }
    
    

}
