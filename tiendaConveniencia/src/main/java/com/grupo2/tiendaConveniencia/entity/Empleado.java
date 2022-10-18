package com.grupo2.tiendaConveniencia.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_EMPLEADO")
public class Empleado implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2788400132826484678L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	
	@Column(name = "ID_EMPLEADO")
	private Integer idEmpleado;
	
	@Column(name = "ID_PERSONA")
	private Integer idPersonae;

	@Column(name = "FECHA_INGRESO")
	private Date fechaIngreso;
	
	@Column(name = "ID_STATUS")
	private Integer idStatus;

	@OneToOne(cascade = CascadeType.ALL,optional=false)
    @JoinColumn(name = "id_persona", referencedColumnName = "id_persona",insertable=false, updatable=false)
	private Persona persona;
		public Persona getPersona() {
	return persona;
}

public void setPersona(Persona persona) {
	this.persona = persona;
}
	public Integer getIdPersonae() {
		return idPersonae;
	}

	public void setIdPersonae(Integer idPersonae) {
		this.idPersonae = idPersonae;
	}



	public Integer getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(Integer idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Integer getIdStatus() {
		return idStatus;
	}

	public void setIdStatus(Integer idStatus) {
		this.idStatus = idStatus;
	}
	
}
