package com.grupo2.tiendaConveniencia.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_TURNO_TIENDA_EMPLEADO")
public class TurnoTiendaEmpleado implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6877642059993696042L;
	@Id
	@Column(name = "ID_EMPLEADO")
	private Integer idEmpleado;
	
	@Column(name = "ID_TURNO")
	private Integer idTurno;
	
	@Column(name = "ID_TIENDA")
	private Integer idTienda;

	@Column(name = "ID_STATUS")
	private Integer idStatus;

	public Integer getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(Integer idEmpleado) {
		this.idEmpleado = idEmpleado;
	}


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


	public Integer getIdStatus() {
		return idStatus;
	}

	public void setIdStatus(Integer idStatus) {
		this.idStatus = idStatus;
	}
	
	
	
}
