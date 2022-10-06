package com.grupo2.tiendaConveniencia.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_TURNO")
public class Turno implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2272994224158504897L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	
	@Column(name = "ID_TURNO")
	private Integer idTurno;
	
	@Column(name = "TURNO")
	private String turno;
	
	@Column(name = "INICIA_TURNO")
	private Date iniciaTurno;
	
	@Column(name = "FIN_TURNO")
	private Date finTurno;

	public Integer getIdTurno() {
		return idTurno;
	}

	public void setIdTurno(Integer idTurno) {
		this.idTurno = idTurno;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public Date getIniciaTurno() {
		return iniciaTurno;
	}

	public void setIniciaTurno(Date iniciaTurno) {
		this.iniciaTurno = iniciaTurno;
	}

	public Date getFinTurno() {
		return finTurno;
	}

	public void setFinTurno(Date finTurno) {
		this.finTurno = finTurno;
	}
	
}
