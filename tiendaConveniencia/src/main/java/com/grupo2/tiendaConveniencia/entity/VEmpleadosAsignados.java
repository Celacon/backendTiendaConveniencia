package com.grupo2.tiendaConveniencia.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "V_EMPLEADOS_ASIGNADOS")
public class VEmpleadosAsignados implements Serializable{	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4993293848167926874L;
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	
	@Column(name = "ID_EMPLEADO")
	private Integer idEmpleado;
	
	@Column(name = "ID_STATUS")
	private Integer idStatus;
	
	@Column(name = "STATUS")
	private String status;
	
	@Column(name = "FECHA_INGRESO")
	private Date fechaIngreso;

	@Column(name = "ID_PERSONA")
	private Integer idPersona;
	
	@Column(name = "PRIMER_NOMBRE")
	private String primerNombre;
	
	@Column(name = "SEGUNDO_NOMBRE")
	private String segundoNombre;
	
	@Column(name = "TERCER_NOMBRE")
	private String tercerNombre;
	
	@Column(name = "PRIMERO_APELLIDO")
	private String primerApellido;
	
	@Column(name = "SEGUNDO_APELLIDO")
	private String segundoApellido;
	
	@Column(name = "ID_TIPO_DOCUMENTO")
	private Integer idTipoDocumento;
	
	@Column(name = "TIPO_DOCUMENTO")
	private String TIPOdocumento;
	
	@Column(name = "DOCUMENTO")
	private String documento;
	
	@Column(name = "NIT")
	private String nit;
	
	@Column(name = "FECHA_NACIMIENTO")
	private Date fechaNacimiento;
	
	@Column(name = "SEXO")
	private String sexo;

	@Column(name = "TELEFONO")
	private Integer telefono;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "DIRECCION")
	private String direccion;

	@Column(name = "ID_USUARIO")
	private Integer idUsuario;
	
	@Column(name = "USUARIO")
	private String usuario;
	
	@Column(name = "CLAVE")
	private String clave;
	
	@Column(name = "ID_ROL")
	private Integer idRol;
	
	
	@Column(name = "ROL")
	private String rol;
	
	@Column(name = "ID_TIENDA")
	private Integer idTienda;
	
	@Column(name = "TIENDA")
	private String tienda;
	
	@Column(name = "ID_TURNO")
	private Integer idTurno;
	
	@Column(name = "TURNO")
	private String turno;
	
	
	@Column(name = "INICIA_TURNO")
	private Date iniciaTurno;
	
	@Column(name = "FIN_TURNO")
	private Date finTurno;

	public Integer getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(Integer idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public Integer getIdStatus() {
		return idStatus;
	}

	public void setIdStatus(Integer idStatus) {
		this.idStatus = idStatus;
	}
	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Integer getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getTercerNombre() {
		return tercerNombre;
	}

	public void setTercerNombre(String tercerNombre) {
		this.tercerNombre = tercerNombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public Integer getIdTipoDocumento() {
		return idTipoDocumento;
	}

	public void setIdTipoDocumento(Integer idTipoDocumento) {
		this.idTipoDocumento = idTipoDocumento;
	}

	public String getTIPOdocumento() {
		return TIPOdocumento;
	}

	public void setTIPOdocumento(String tIPOdocumento) {
		TIPOdocumento = tIPOdocumento;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
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

	public Integer getIdRol() {
		return idRol;
	}

	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public Integer getIdTienda() {
		return idTienda;
	}

	public void setIdTienda(Integer idTienda) {
		this.idTienda = idTienda;
	}

	public String getTienda() {
		return tienda;
	}

	public void setTienda(String tienda) {
		this.tienda = tienda;
	}

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
