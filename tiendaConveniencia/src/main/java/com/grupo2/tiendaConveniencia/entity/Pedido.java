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
@Table(name = "TBL_PEDIDO")

public class Pedido implements Serializable{

	private static final long serialVersionUID = 3L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "ID_UBICACION")
	private Integer idUbicacion;
	
	@Column(name = "ID_GASOLINERA")
	private Integer idGasolinera;
	
	@Column(name = "ID_TIENDA")
	private Integer idTienda;
	
	@Column(name = "ID_CLIENTE")
	private Integer idCliente;
	
	@Column(name = "SERIE")
	private String serie;
	
	@Column(name = "ID_STATUS")
	private Integer idStatus;
	
	@Column(name = "SERIE_CORRELATIVO")
	private Integer serieCorrelativo;
	
	@Column(name = "IDICACION_DESPACHO")
	private String idicacionDespacho;
	
	@Column(name = "OBS_DESPACHO")
	private String obsDespacho;

	public Integer getIdUbicacion() {
		return idUbicacion;
	}

	public void setIdUbicacion(Integer idUbicacion) {
		this.idUbicacion = idUbicacion;
	}

	public Integer getIdGasolinera() {
		return idGasolinera;
	}

	public void setIdGasolinera(Integer idGasolinera) {
		this.idGasolinera = idGasolinera;
	}

	public Integer getIdTienda() {
		return idTienda;
	}

	public void setIdTienda(Integer idTienda) {
		this.idTienda = idTienda;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public Integer getIdStatus() {
		return idStatus;
	}

	public void setIdStatus(Integer idStatus) {
		this.idStatus = idStatus;
	}

	public Integer getSerieCorrelativo() {
		return serieCorrelativo;
	}

	public void setSerieCorrelativo(Integer serieCorrelativo) {
		this.serieCorrelativo = serieCorrelativo;
	}

	public String getIdicacionDespacho() {
		return idicacionDespacho;
	}

	public void setIdicacionDespacho(String idicacionDespacho) {
		this.idicacionDespacho = idicacionDespacho;
	}

	public String getObsDespacho() {
		return obsDespacho;
	}

	public void setObsDespacho(String obsDespacho) {
		this.obsDespacho = obsDespacho;
	}
	

}
