package co.com.funlam.ods.model.input;

import co.com.funlam.ods.model.PercepcionObjetivoDTO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class RegistroODSRequest {

    private String identificacion;
    private String nombres;
    private String apellidos;
    private Date fechaNacimiento;
    private String sexo;

    private Long idTipoIdentificacion;
    private Long idEducacion;
    private Long idCiudad;
    private Long idDepartamento;

    private List<PercepcionObjetivoDTO> percepcionesObjetivos;
    private List<Long> idObjetivosFundamentales;


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

    public Long getIdTipoIdentificacion() {
        return idTipoIdentificacion;
    }

    public void setIdTipoIdentificacion(Long idTipoIdentificacion) {
        this.idTipoIdentificacion = idTipoIdentificacion;
    }

    public Long getIdEducacion() {
        return idEducacion;
    }

    public void setIdEducacion(Long idEducacion) {
        this.idEducacion = idEducacion;
    }

    public Long getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(Long idCiudad) {
        this.idCiudad = idCiudad;
    }

    public Long getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Long idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public List<PercepcionObjetivoDTO> getPercepcionesObjetivos() {
        return percepcionesObjetivos;
    }

    public void setPercepcionesObjetivos(List<PercepcionObjetivoDTO> percepcionesObjetivos) {
        this.percepcionesObjetivos = percepcionesObjetivos;
    }

    public List<Long> getIdObjetivosFundamentales() {
        return idObjetivosFundamentales;
    }

    public void setIdObjetivosFundamentales(List<Long> idObjetivosFundamentales) {
        this.idObjetivosFundamentales = idObjetivosFundamentales;
    }
}
