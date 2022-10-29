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
	
	@Column(name = "ID_CATEGORIA")
	private Integer idCategoria;
	
	@Column(name = "PRODUCTO")
	private String producto;
	
	@Column(name = "PRECIO")
	private Double precio;
	
	@Column(name = "ID_STATUS")
	private Integer idStatus;
	
	
	/*@OneToMany(mappedBy = "idTiendaProducto")
	private List<TiendaProducto> tiendaProductoList; */
	
	

	public Integer getIdProducto() {
		return idProducto;
	}

	public Integer getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	public Integer getIdStatus() {
		return idStatus;
	}

	public void setIdStatus(Integer idStatus) {
		this.idStatus = idStatus;
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


	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	
	
	
}
