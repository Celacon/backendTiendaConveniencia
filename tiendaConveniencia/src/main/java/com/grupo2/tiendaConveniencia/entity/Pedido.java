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
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "ID_TIENDA")
	private Integer idTienda;
	
	@Column(name = "ID_CLIENTE")
	private Integer idCliente;

	@Column(name = "SERIE")
	private String serie;
	
	@Column(name = "SERIE_CORRELATIVO")
	private Integer serieCorrelativo;
	
	@Column(name = "ID_STATUS")
	private Integer idStatus;

	@Column(name = "DIRECCIONENTREGA")
	private String direccionEntrega;
	
	@Column(name = "OBS_DESPACHO")
	private String obsDespacho;
	
	public String getDireccionEntrega() {
		return direccionEntrega;
	}

	public void setDireccionEntrega(String direccionEntrega) {
		this.direccionEntrega = direccionEntrega;
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

	public Integer getSerieCorrelativo() {
		return serieCorrelativo;
	}

	public void setSerieCorrelativo(Integer serieCorrelativo) {
		this.serieCorrelativo = serieCorrelativo;
	}

	public Integer getIdStatus() {
		return idStatus;
	}

	public void setIdStatus(Integer idStatus) {
		this.idStatus = idStatus;
	}

	public String getObsDespacho() {
		return obsDespacho;
	}

	public void setObsDespacho(String obsDespacho) {
		this.obsDespacho = obsDespacho;
	}
	
}
