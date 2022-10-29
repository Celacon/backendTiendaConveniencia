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
@Table(name = "TBL_STATUS")

public class Status implements Serializable{

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 5935461743965123819L;
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	
	@Column(name = "ID_STATUS")
	private Integer idStatus;
	
	@Column(name = "STATUS")
	private String status;
	
	@Column(name = "STS_DESCRIPCION")
	private String stsDescripcion;

	public Integer getIdStatus() {
		return idStatus;
	}

	public void setIdStatus(Integer idStatus) {
		this.idStatus = idStatus;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStsDescripcion() {
		return stsDescripcion;
	}

	public void setStsDescripcion(String stsDescripcion) {
		this.stsDescripcion = stsDescripcion;
	}

	
	
}
