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
@Table(name = "VIEW_TIENDA")
public class ViewTienda implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -526060073935729651L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)

	@Column(name = "ID_TIENDA")
	private Integer idTienda;
	
	@Column(name = "TIENDA")
	private String tienda;
	
	@Column(name = "UBICACION")
	private String ubicacion;
	
	@Column(name = "GASOLINERA")
	private String gasolinera;
	
	@Column(name = "STATUS")
	private String status;

	public Integer getIdTienda() {
		return idTienda;
	}

	public void setIdTienda(Integer idTienda) {
		this.idTienda = idTienda;
	}

	public String getTienda() {
		return tienda;
	}

	public void setTienda(String tienda) {
		this.tienda = tienda;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getGasolinera() {
		return gasolinera;
	}

	public void setGasolinera(String gasolinera) {
		this.gasolinera = gasolinera;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
