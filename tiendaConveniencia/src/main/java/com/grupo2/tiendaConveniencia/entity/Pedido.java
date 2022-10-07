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
	@Column(name = "ID_TIENDA")
	private Integer idTienda;
	
	@Column(name = "U_PADRE")
	private Integer uPadre;
	
	@Column(name = "ID_UBICACION")
	private Integer idUbicacion;
	
	@Column(name = "ID_VENTA")
	private Integer idVenta;
	
	@Column(name = "IDICACION_DESPACHO")
	private String idicacionDespacho;
	
	@Column(name = "OBS_DESPACHO")
	private String obsDespacho;
	
	@Column(name = "STS_DESPACHO")
	private Integer stsDespacho;

}
