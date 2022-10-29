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
@Table(name="tbl_usuario")
public class Usuario implements Serializable {
	



	private static final long serialVersionUID = -1860374313456226261L;
	      
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)		
	@Column(name = "id_usuario")	
	private Integer idUsuario;
	
	@Basic(optional = false)
	@Column(name = "id_persona")	
	private Integer idPersona;
	
	@Basic(optional = false)
	@Column(name = "id_rol")	
	private Integer idRol;
	
	@Basic(optional = false)
	@Column(name = "usuario")	
	private String usuario;
	
	@Basic(optional = false)
	@Column(name = "clave")	
	private String clave;
	
	@Basic(optional = false)
	@Column(name = "id_status")	
	private Integer idStatus;

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Integer getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public Integer getIdRol() {
		return idRol;
	}

	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Integer getIdStatus() {
		return idStatus;
	}

	public void setIdStatus(Integer idStatus) {
		this.idStatus = idStatus;
	}
	
	
	
}
