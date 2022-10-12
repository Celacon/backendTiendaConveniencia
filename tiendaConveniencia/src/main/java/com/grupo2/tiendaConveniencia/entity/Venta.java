package com.grupo2.tiendaConveniencia.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_VENTA")

public class Venta implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "ID_UBICACION")
	private Integer idUbicacion;
	
	@Column(name = "ID_GASOLINERA")
	private Integer idGasolinera;
	
	@Column(name = "ID_TIENDA")
	private Integer idTienda;
	
	@Column(name = "FECHA_FACTURA")
	private Date fechaFactura;
	
	@Column(name = "ID_CLIENTE")
	private Integer idCliente;
	
	@Column(name = "ID_PERSONA")
	private Integer idPersona;
	
	@Column(name = "SERIE")
	private String nombre;
	
	@Column(name = "SERIE_CORRELATIVO")
	private Integer serieCorrelativo;
	
	@Column(name = "ID_TIPO_PAGO")
	private Integer idTipoPago;
	
	@Column(name = "ID_STATUS")
	private Integer idStatus;
	
	@Column(name = "TOTAL_FACTURA")
	private Integer totalFactura;
	
	@Column(name = "TIPO_VENTA")
	private String tipoVenta;

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

	public Date getFechaFactura() {
		return fechaFactura;
	}

	public void setFechaFactura(Date fechaFactura) {
		this.fechaFactura = fechaFactura;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public Integer getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getSerieCorrelativo() {
		return serieCorrelativo;
	}

	public void setSerieCorrelativo(Integer serieCorrelativo) {
		this.serieCorrelativo = serieCorrelativo;
	}

	public Integer getIdTipoPago() {
		return idTipoPago;
	}

	public void setIdTipoPago(Integer idTipoPago) {
		this.idTipoPago = idTipoPago;
	}

	public Integer getIdStatus() {
		return idStatus;
	}

	public void setIdStatus(Integer idStatus) {
		this.idStatus = idStatus;
	}

	public Integer getTotalFactura() {
		return totalFactura;
	}

	public void setTotalFactura(Integer totalFactura) {
		this.totalFactura = totalFactura;
	}

	public String getTipoVenta() {
		return tipoVenta;
	}

	public void setTipoVenta(String tipoVenta) {
		this.tipoVenta = tipoVenta;
	}
	
	
}
