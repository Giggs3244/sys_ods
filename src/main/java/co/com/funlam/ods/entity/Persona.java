package co.com.funlam.ods.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Persona {

    @Id
    private
    Long idPersona;
    private String identificacion;
    private String nombres;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private LocalDateTime fechaRegistro;
    private String sexo;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idTipoIdentificacion", nullable = false)
    private
    TipoIdentificacion tipoIdentificacion;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idEducacion", nullable = false)
    private
    NivelEducacion nivelEducacion;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idCiudad", nullable = false)
    private
    Ciudad ciudad;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idDepartamento", nullable = false)
    private
    Departamento departamento;

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public TipoIdentificacion getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public NivelEducacion getNivelEducacion() {
        return nivelEducacion;
    }

    public void setNivelEducacion(NivelEducacion nivelEducacion) {
        this.nivelEducacion = nivelEducacion;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
