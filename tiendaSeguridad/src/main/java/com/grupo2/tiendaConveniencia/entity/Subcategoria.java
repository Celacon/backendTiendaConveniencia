package com.grupo2.tiendaConveniencia.entity;

import java.io.Serializable;
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
@Table(name = "TBL_SUB_CATEGORIA")
public class Subcategoria implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8598847209321187963L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
@Basic(optional = false)
	
	@Column(name = "ID_SUB_CATEGORIA")
	private Integer idSubcategoria;
	
	
	@Column(name = "ID_CATEGORIA")
	private String idCategoria;
	
	@Column(name = "SUB_CATEGORIA")
	private String subCategoria;
	
	/*@OneToMany(mappedBy = "idSubcategoria")
	private List<Producto> productoSubCaList;
	
	
	public List<Producto> getProductoSubCaList() {
		return productoSubCaList;
	}
	
	public void setProductoSubCaList(List<Producto> productoSubCaList) {
		this.productoSubCaList = productoSubCaList;
	}
*/
	public Integer getIdSubcategoria() {
		return idSubcategoria;
	}
	public void setIdSubcategoria(Integer idSubcategoria) {
		this.idSubcategoria = idSubcategoria;
	}
	public String getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(String idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getSubCategoria() {
		return subCategoria;
	}
	public void setSubCategoria(String subCategoria) {
		this.subCategoria = subCategoria;
	}
	
	
	
}
