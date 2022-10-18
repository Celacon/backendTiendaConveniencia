package com.grupo2.tiendaConveniencia.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_TURNO_TIENDA")
public class TurnoTienda implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5054796538241948960L;
	@Id
	@Basic(optional = false)
	@Column(name = "ID_TURNO")
	private Integer idTurno;
	
	
	@Column(name = "ID_TIENDA")
	private Integer idTienda;

	public Integer getIdTurno() {
		return idTurno;
	}

	public void setIdTurno(Integer idTurno) {
		this.idTurno = idTurno;
	}

	public Integer getIdTienda() {
		return idTienda;
	}

	public void setIdTienda(Integer idTienda) {
		this.idTienda = idTienda;
	}
	
	
	
}
