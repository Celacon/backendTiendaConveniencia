package com.grupo2.tiendaConveniencia.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Table(name = "V_EMPLEADOS_NO_ASIGNADOS")
public class VEmpleadosNoAsignados implements Serializable {
    
    
    private static final long serialVersionUID = 4992938412010926874L;
    
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    
    @Column(name = "ID_EMPLEADO")
    private Integer idEmpleado;
    
    @Column(name = "ID_STATUS")
    private Integer idStatus;
    
    @Column(name = "STATUS")
    private String status;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd") 
    @JsonFormat(pattern = "yyyy-MM-dd")
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
    private String tipoocumento;
    
    @Column(name = "DOCUMENTO")
    private String documento;
    
    @Column(name = "NIT")
    private String nit;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd") 
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "FECHA_NACIMIENTO")
    private Date fechaNacimiento;
    
    @Column(name = "SEXO")
    private String sexo;

    @Column(name = "TELEFONO")
    private Integer telefono;
    
    @Column(name = "EMAIL")
    private String email;
    
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

    public String getTipoocumento() {
        return tipoocumento;
    }

    public void setTipoocumento(String tipoocumento) {
        this.tipoocumento = tipoocumento;
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

    @Column(name = "DIRECCION")
    private String direccion;
    
    
    


}
