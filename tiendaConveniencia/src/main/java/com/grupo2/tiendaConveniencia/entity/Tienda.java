package com.grupo2.tiendaConveniencia.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_TIENDA")
public class Tienda implements Serializable{

    
    private static final long serialVersionUID = 1247555444003336644L;
    
    
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    
    @Column(name = "ID_TIENDA")
    private Integer idTienda;
    
    @Column(name = "ID_STATUS")
    private Integer idStatus;
    
    @Column(name = "ID_GASOLINERA")
    private Integer idGasolinera;
    
    @Column(name = "TIENDA")
    private String tienda;

    public Integer getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(Integer idTienda) {
        this.idTienda = idTienda;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

    public Integer getIdGasolinera() {
        return idGasolinera;
    }

    public void setIdGasolinera(Integer idGasolinera) {
        this.idGasolinera = idGasolinera;
    }

    public String getTienda() {
        return tienda;
    }

    public void setTienda(String tienda) {
        this.tienda = tienda;
    }
    
    
}
