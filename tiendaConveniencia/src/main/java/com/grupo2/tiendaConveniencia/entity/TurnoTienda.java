package com.grupo2.tiendaConveniencia.entity;

import java.io.Serializable;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;



@Entity
@Table(name = "TBL_TURNO_TIENDA")
@IdClass(TurnoTiendaKey.class)
public class TurnoTienda implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5054796538241948960L;
	  @Id
	
	private Integer idTurno;
		
	  @Id
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
