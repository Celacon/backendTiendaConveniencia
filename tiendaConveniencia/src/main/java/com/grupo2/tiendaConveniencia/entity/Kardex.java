package com.grupo2.tiendaConveniencia.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="view_kardex")
public class Kardex implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 892689424005522379L;

	@Id
	@Basic(optional=false)
	@Column(name="id_vista_kardex")
	private Integer idVistaKardex;
	
	@Basic(optional=false)
	@Column(name="id_tienda")
	private Integer idTienda;
	
	@Basic(optional=false)
	@Column(name="id_kardex")
	private Integer idKardex;
	
	@Basic(optional=false)
	@Column(name="tienda")
	private String tienda;
	
	@Basic(optional=false)
	@Column(name="id_producto")
	private Integer idProducto;
	
	@Basic(optional=false)
	@Column(name="producto")
	private String producto;
	
	@Basic(optional=false)
	@Column(name="fecha_mov")
	private String fechaMov;
	
	@Basic(optional=false)
	@Column(name="tipo_movimiento")
	private String tipoMovimiento;
	
	@Basic(optional=false)
	@Column(name="cant_mov")
	private Integer cantMov;
	
	@Basic(optional=false)
	@Column(name="saldo_actual")
	private Integer saldoActual;
	
	public Integer getIdVistaKardex() {
		return idVistaKardex;
	}

	public void setIdVistaKardex(Integer idVistaKardex) {
		this.idVistaKardex = idVistaKardex;
	}

	public Integer getIdTienda() {
		return idTienda;
	}

	public void setIdTienda(Integer idTienda) {
		this.idTienda = idTienda;
	}

	public Integer getIdKardex() {
		return idKardex;
	}

	public void setIdKardex(Integer idKardex) {
		this.idKardex = idKardex;
	}

	public String getTienda() {
		return tienda;
	}

	public void setTienda(String tienda) {
		this.tienda = tienda;
	}

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public String getFechaMov() {
		return fechaMov;
	}

	public void setFechaMov(String fechaMov) {
		this.fechaMov = fechaMov;
	}

	public String getTipoMovimiento() {
		return tipoMovimiento;
	}

	public void setTipoMovimiento(String tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}

	public Integer getCantMov() {
		return cantMov;
	}

	public void setCantMov(Integer cantMov) {
		this.cantMov = cantMov;
	}

	public Integer getSaldoActual() {
		return saldoActual;
	}

	public void setSaldoActual(Integer saldoActual) {
		this.saldoActual = saldoActual;
	}

	
	


}
