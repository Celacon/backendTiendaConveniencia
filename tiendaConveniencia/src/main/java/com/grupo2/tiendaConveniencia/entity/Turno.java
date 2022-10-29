package com.grupo2.tiendaConveniencia.entity;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name ="TBL_TURNO")
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
	
	@Column(name = "ID_STATUS")
    private Integer idStatus;
	
	@Column(name = "TURNO")
	private String turno;

	@Column(name = "INICIA_TURNO")
	private String iniciaTurno;
	
	@Column(name = "FIN_TURNO")
	private String finTurno;

	public Integer getIdTurno() {
		return idTurno;
	}

	public void setIdTurno(Integer idTurno) {
		this.idTurno = idTurno;
	}
	

	public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

    public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

    public String getIniciaTurno() {
        return iniciaTurno;
    }

    public void setIniciaTurno(String iniciaTurno) {
        this.iniciaTurno = iniciaTurno;
    }

    public String getFinTurno() {
        return finTurno;
    }

    public void setFinTurno(String finTurno) {
        this.finTurno = finTurno;
    }

  
    



	
}
