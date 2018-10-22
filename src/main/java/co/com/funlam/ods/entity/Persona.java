package co.com.funlam.ods.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "PERSONA")
public class Persona {

    @Id
    @TableGenerator(name = "Persona_Gen", table = "ID_GEN", pkColumnName = "GEN_NAME", valueColumnName = "GEN_VAL", pkColumnValue = "Persona_Gen", initialValue = 1000, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "Persona_Gen")
    @Column(name = "IDPERSONA")
    private Long idPersona;

    @Column(name = "IDENTIFICACION", nullable = false, length = 15)
    private String identificacion;

    @Column(name = "NOMBRES", nullable = false, length = 60)
    private String nombres;

    @Column(name = "APELLIDOS", nullable = false, length = 60)
    private String apellidos;

    @Column(name = "FECHANACIMIENTO", nullable = false, length = 7)
    private Date fechaNacimiento;

    @Column(name = "SEXO", nullable = false, length = 10)
    private String sexo;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IDTIPOID", nullable = false)
    private TipoIdentificacion tipoIdentificacion;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IDEDUCACION", nullable = false)
    private NivelEducacion nivelEducacion;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IDCIUDAD", nullable = false)
    private Ciudad ciudad;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IDDEPARTAMENTO", nullable = false)
    private Departamento departamento;

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
