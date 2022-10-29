package com.grupo2.tiendaConveniencia.entity;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "V_TURNO_TIENDA")
@IdClass(VTurnoTiendaKey.class)
public class VTurnoTienda  implements Serializable{
    
    
    private static final long serialVersionUID = 499293841233344874L;
    
    @Id
    private Integer idTienda;
    @Id
    private Integer idTurno;
    
    @Column(name = "TURNO")
    private String turno;
    
    @Column(name = "TIENDA")
    private String tienda;

  
    public Integer getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(Integer idTienda) {
        this.idTienda = idTienda;
    }

    public Integer getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(Integer idTurno) {
        this.idTurno = idTurno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getTienda() {
        return tienda;
    }

    public void setTienda(String tienda) {
        this.tienda = tienda;
    }
    
    
    

    
}
