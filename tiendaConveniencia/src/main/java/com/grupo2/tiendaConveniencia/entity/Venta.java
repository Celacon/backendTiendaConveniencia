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
	@Column(name = "ID_VENTA")
	private Integer idVenta;
	
	@Column(name = "ID_TIENDA")
	private Integer idTienda;
	
	@Column(name = "ID_CLIENTE")
	private Integer idCliente;
	
	@Column(name = "ID_TIPO_PAGO")
	private Integer idTipoPago;
	
	@Column(name = "SERIE")
	private String nombre;
	
	@Column(name = "SERIE_CORRELATIVO")
	private Integer serieCorrelativo;
	
	@Column(name = "ID_PERSONA")
	private Integer idPersona;
	
	@Column(name = "FECHA_FACTURA")
	private Date fechaFactura;
	
	@Column(name = "TOTAL_FACTURA")
	private Integer totalFactura;
	
	@Column(name = "TIPO_VENTA")
	private String tipoVenta;
	
	
	
}
