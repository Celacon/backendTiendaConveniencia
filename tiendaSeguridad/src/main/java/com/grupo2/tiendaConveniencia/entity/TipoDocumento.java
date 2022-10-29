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
@Table(name = "TBL_TIPO_DOCUMENTO")
public class TipoDocumento implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8807893915251118168L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)	
	@Column(name = "ID_TIPO_DOCUMENTO")
	private Integer idTipoDocumento;
	
	@Column(name = "TIPO_DOCUMENTO")
	private String tipoDocumento;

	public Integer getIdTipoDocumento() {
		return idTipoDocumento;
	}

	public void setIdTipoDocumento(Integer idTipoDocumento) {
		this.idTipoDocumento = idTipoDocumento;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	
	
	
	
	
	

}