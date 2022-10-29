package com.grupo2.tiendaConveniencia.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VIEW_UBICACION")
public class ViUbicacion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8285458301656505141L;

	@Id
	@Basic(optional = false)
	@Column(name = "ID_VISTA_UBICACION")
	private Integer idVistaUbicacion;
	

	public Integer getIdVistaUbicacion() {
		return idVistaUbicacion;
	}

	public void setIdVistaUbicacion(Integer idVistaUbicacion) {
		this.idVistaUbicacion = idVistaUbicacion;
	}

	/*@Column(name = "ID_UBICACION")
	private Integer idUbicacion;*/
	
	@Column(name = "TIPOUBICACIONPADRE")
	private String tipoubicacionpadre;
	
	@Column(name = "UBICACION")
	private String ubicacion;


	@Column(name = "TIPOUBICACIONDEHIJO")
	private String tipoUbicacionHijo;
	
	@Column(name = "UBICACIONJERARQUICAHIJO")
	private String ubicacionJerarquica;

	/*public Integer getIdUbicacion() {
		return idUbicacion;
	}

	public void setIdUbicacion(Integer idUbicacion) {
		this.idUbicacion = idUbicacion;
	}
	*/
	
	public String getTipoubicacionpadre() {
		return tipoubicacionpadre;
	}

	public void setTipoubicacionpadre(String tipoubicacionpadre) {
		this.tipoubicacionpadre = tipoubicacionpadre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getTipoUbicacionHijo() {
		return tipoUbicacionHijo;
	}

	public void setTipoUbicacionHijo(String tipoUbicacionHijo) {
		this.tipoUbicacionHijo = tipoUbicacionHijo;
	}

	public String getUbicacionJerarquica() {
		return ubicacionJerarquica;
	}

	public void setUbicacionJerarquica(String ubicacionJerarquica) {
		this.ubicacionJerarquica = ubicacionJerarquica;
	}
	

}
