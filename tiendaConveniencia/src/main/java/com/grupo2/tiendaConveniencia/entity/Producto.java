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
@Table(name = "TBL_PRODUCTO")
public class Producto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8737214709744644414L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	
	@Column(name = "ID_PRODUCTO")
	private Integer idProducto;
	
	@Column(name = "ID_PRESENTACION")
	private Integer idPresentacion;
	
	@Column(name = "ID_SUB_CATEGORIA")
	private Integer idSubcategoria;
	
	@Column(name = "PRODUCTO")
	private String producto;
	
	@Column(name = "STS_PRODUCTO")
	private Integer stsProducto;
	
	@Column(name = "PRECIO")
	private Double precio;

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public Integer getIdPresentacion() {
		return idPresentacion;
	}

	public void setIdPresentacion(Integer idPresentacion) {
		this.idPresentacion = idPresentacion;
	}

	

	public Integer getIdSubcategoria() {
		return idSubcategoria;
	}

	public void setIdSubcategoria(Integer idSubcategoria) {
		this.idSubcategoria = idSubcategoria;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public Integer getStsProducto() {
		return stsProducto;
	}

	public void setStsProducto(Integer stsProducto) {
		this.stsProducto = stsProducto;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	
	
	
}
