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
@Table(name = "TBL_VENTA_DETALLE")

public class VentaDetalle implements Serializable{

	private static final long serialVersionUID = 2L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "ID_UBICACION")
	private Integer idUbicacion;
	
	@Column(name = "ID_GASOLINERA")
	private Integer idGasolinera;
	
	@Column(name = "ID_TIENDA")
	private Integer idTienda;
	
	@Column(name = "ID_CATEGORIA")
	private Integer idCategoria;
	
	@Column(name = "SERIE")
	private String serie;
	
	@Column(name = "ID_CLIENTE")
	private Integer idCliente;
	
	@Column(name = "ID_PRODUCTO")
	private Integer idProducto;
	
	@Column(name = "CANTIDAD")
	private Integer cantidad;
	
	@Column(name = "PRECIO")
	private Integer precio;
	
	@Column(name = "SUB_TOTAL")
	private Integer subTotal;

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

	public Integer getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public Integer getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Integer subTotal) {
		this.subTotal = subTotal;
	}
	

}
