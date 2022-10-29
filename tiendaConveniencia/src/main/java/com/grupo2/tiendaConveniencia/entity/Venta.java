package com.grupo2.tiendaConveniencia.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_VENTA")

public class Venta implements Serializable {

	
	
	private static final long serialVersionUID = 6170409007612387957L;

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)	
	@Column(name = "ID_TIENDA")
	private Integer idTienda;
	
	@Column(name = "FECHA_FACTURA")
	private Date fechaFactura;
	
	@Column(name = "ID_CLIENTE")
	private Integer idCliente;
	
	@Column(name = "SERIE")
	private String serie;
	
	@Column(name = "SERIE_CORRELATIVO")
	private Integer serieCorrelativo;
	
	@Column(name = "ID_TIPO_PAGO")
	private Integer idTipoPago;
	
	@Column(name = "ID_STATUS")
	private Integer idStatus;
	
	@Column(name = "TOTAL_FACTURA")
	private Double totalFactura;
	
	@Column(name = "TIPO_VENTA")
	private String tipoVenta;

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

	public String getSerie() {
		return serie;
	}

	public void setNombre(String serie) {
		this.serie = serie;
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

	public Double getTotalFactura() {
		return totalFactura;
	}

	public void setTotalFactura(Double totalFactura) {
		this.totalFactura = totalFactura;
	}

	public String getTipoVenta() {
		return tipoVenta;
	}

	public void setTipoVenta(String tipoVenta) {
		this.tipoVenta = tipoVenta;
	}
	
	
}
