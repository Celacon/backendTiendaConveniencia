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
@Table(name = "TBL_TIPO_UBICACION")
public class TipoUbicacion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6917595337395112542L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	
	@Column(name = "ID_TIPO_UBICACION")
	private Integer idTipoUbicacion;
	
	@Column(name = "TIPO_UBICACION")
	private String tipoUbicacion;
	
	/*@OneToMany(mappedBy = "idTipoUbicacion")
	private List<Ubicacion> ubicacionList;*/
	
	
	public Integer getIdTipoUbicacion() {
		return idTipoUbicacion;
	}

	public void setIdTipoUbicacion(Integer idTipoUbicacion) {
		this.idTipoUbicacion = idTipoUbicacion;
	}

	public String getTipoUbicacion() {
		return tipoUbicacion;
	}

	public void setTipoUbicacion(String tipoUbicacion) {
		this.tipoUbicacion = tipoUbicacion;
	}

	/*public List<Ubicacion> getUbicacionList() {
		return ubicacionList;
	}

	public void setUbicacionList(List<Ubicacion> ubicacionList) {
		this.ubicacionList = ubicacionList;
	}*/

	
	
	
	
}
