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
@Table(name = "TBL_PRESENTACION")
public class Presentacion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4091526887645802724L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	
	@Column(name = "ID_PRESENTACION")
	private Integer idPresentacion;
	
	@Column(name = "PRESENTACION")
	private String presentacion;
	
	/*@OneToMany(mappedBy = "idPresentacion")
	private List<Producto> productoPreList;
	
	public List<Producto> getProductoPreList() {
		return productoPreList;
	}

	public void setProductoPreList(List<Producto> productoPreList) {
		this.productoPreList = productoPreList;
	}
	*/

	public Integer getIdPresentacion() {
		return idPresentacion;
	}

	public void setIdPresentacion(Integer idPresentacion) {
		this.idPresentacion = idPresentacion;
	}

	public String getPresentacion() {
		return presentacion;
	}

	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}

	


	
}
