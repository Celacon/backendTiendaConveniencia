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
	@Column(name = "ID_PRODUCTO")
	private Integer idProducto;
	
	@Column(name = "ID_VENTA")
	private Integer idVenta;
	
	@Column(name = "SERIE")
	private String serie;
	
	@Column(name = "ID_CATEGORIA")
	private Integer idCategoria;
	
	@Column(name = "ID_TIENDA")
	private Integer idTienda;
	
	@Column(name = "CANTIDAD")
	private Integer cantidad;
	
	@Column(name = "PRECIO")
	private Integer precio;
	
	@Column(name = "SUB_TOTAL")
	private Integer subTotal;
	
	
	
}
