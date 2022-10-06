package com.grupo2.tiendaConveniencia.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
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
	private Integer idPersona;
	
	@Column(name = "FECHA_INGRESO")
	private Date fechaIngreso;
	
	@Column(name = "STS_EMPLEADO")
	private Integer stsEmpleado;
	
/*	@OneToOne(fetch = FetchType.LAZY)
	  @MapsId
	  @JoinColumn(name = "idPersona")
	 // private Persona persona;
	*/

	


	public Integer getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(Integer idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	

	public Integer getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Integer getStsEmpleado() {
		return stsEmpleado;
	}

	public void setStsEmpleado(Integer stsEmpleado) {
		this.stsEmpleado = stsEmpleado;
	}

	


	


	
	
}
