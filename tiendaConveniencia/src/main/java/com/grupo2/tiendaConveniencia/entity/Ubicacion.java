package com.grupo2.tiendaConveniencia.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_UBICACION")
public class Ubicacion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2229949774415708693L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	
	@Column(name = "ID_UBICACION")
	private Integer idUbicacion;
	
	@Column(name = "UBICACION")
	private String ubicacion;
	
	public Integer getIdUbicacion() {
		return idUbicacion;
	}

	public void setIdUbicacion(Integer idUbicacion) {
		this.idUbicacion = idUbicacion;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Integer getuPadre() {
		return uPadre;
	}

	public void setuPadre(Integer uPadre) {
		this.uPadre = uPadre;
	}


	public Integer getIdTipoUbicacion() {
		return idTipoUbicacion;
	}

	public void setIdTipoUbicacion(Integer idTipoUbicacion) {
		this.idTipoUbicacion = idTipoUbicacion;
	}

	@Column(name = "U_PADRE")
	private Integer uPadre;
	
	@Column(name = "ID_TIPO_UBICACION")
	private Integer idTipoUbicacion;
	
	/*@ManyToOne
	@JoinColumn(name="U_PADRE", referencedColumnName  = "TBL_U_PADRE")
	private Ubicacion upadre;
	
	@OneToMany(mappedBy = "upadre")
	private List<Ubicacion> uHijo;

	public Ubicacion getUpadre() {
		return upadre;
	}

	public void setUpadre(Ubicacion upadre) {
		this.upadre = upadre;
	}

	public List<Ubicacion> getuHijo() {
		return uHijo;
	}

	public void setuHijo(List<Ubicacion> uHijo) {
		this.uHijo = uHijo;
	}*/
	
	//relacion uno a uno con tabla pedido y con gasolinera
	
	

}
