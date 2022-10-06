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
@Table(name = "TBL_ROL")
public class Rol implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2682333933829181597L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	
	@Column(name = "ID_ROL")
	private Integer idRol;
	
	@Column(name = "ROL")
	private String rol;
	
	@Column(name = "DESCRIPCION")
	private String descripcion;
	
	@Column(name = "STS_ROL")
	private Integer stsRol;

	public Integer getIdRol() {
		return idRol;
	}

	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getStsRol() {
		return stsRol;
	}

	public void setStsRol(Integer stsRol) {
		this.stsRol = stsRol;
	}
	
	
	
}
