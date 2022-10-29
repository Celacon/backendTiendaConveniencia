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
@Table(name = "TBL_CATEGORIA")
public class Categoria implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4096324445746864465L;

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	
	@Column(name = "ID_CATEGORIA")
	private Integer idCategoria;
	
	@Column(name = "CATEGORIA")
	private String categoria;
	
	
	 @OneToMany(mappedBy = "idCategoria")
	private List<Subcategoria> subCategoriaList;
	  

	public List<Subcategoria> getSubCategoriaList() {
		return subCategoriaList;
	}

	public void setSubCategoriaList(List<Subcategoria> subCategoriaList) {
		this.subCategoriaList = subCategoriaList;
	}

	public Integer getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
}
