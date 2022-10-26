package com.grupo2.tiendaConveniencia.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_GASOLINERA")
public class Gasolinera implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8977353558711880212L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	
	@Column(name = "ID_GASOLINERA")
	private Integer idGasolinera;
	
	@Column(name = "ID_UBICACION")
	private Integer idUbicacion;
	
	@Column(name = "GASOLINERA")
	private String gasolinera;
	

	public Integer getIdGasolinera() {
		return idGasolinera;
	}

	public void setIdGasolinera(Integer idGasolinera) {
		this.idGasolinera = idGasolinera;
	}

	public Integer getIdUbicacion() {
		return idUbicacion;
	}

	public void setIdUbicacion(Integer idUbicacion) {
		this.idUbicacion = idUbicacion;
	}

	public String getGasolinera() {
		return gasolinera;
	}

	public void setGasolinera(String gasolinera) {
		this.gasolinera = gasolinera;
	} 

}
