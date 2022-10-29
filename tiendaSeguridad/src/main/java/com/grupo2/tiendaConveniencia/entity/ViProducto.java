package com.grupo2.tiendaConveniencia.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VIEW_PRODUCTO")
public class ViProducto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5430478468763737837L;


	@Id
	@Basic(optional = false)
	@Column(name = "ID_PRODUCTO")
	private Integer idProducto;
	
	@Column(name = "PRODUCTO")
	private String producto;
	
	@Column(name = "CATEGORIA")
	private String categoria;
	
	@Column(name = "SUB_CATEGORIA")
	private String sub_Categoria;
	
	@Column(name = "PRESENTACION")
	private String presentacion;
	
	@Column(name = "PRECIO")
	private Double precio;

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

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getSub_Categoria() {
		return sub_Categoria;
	}

	public void setSub_Categoria(String sub_Categoria) {
		this.sub_Categoria = sub_Categoria;
	}

	public String getPresentacion() {
		return presentacion;
	}

	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	
}
