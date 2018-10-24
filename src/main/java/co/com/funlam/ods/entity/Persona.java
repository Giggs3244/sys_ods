package co.com.funlam.ods.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDTIPOID", referencedColumnName = "IDTIPOID")
    private TipoIdentificacion tipoIdentificacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDEDUCACION", referencedColumnName = "IDEDUCACION")
    private NivelEducacion nivelEducacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDCIUDAD", referencedColumnName = "IDCIUDAD")
    private Ciudad ciudad;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDDEPARTAMENTO", referencedColumnName = "IDDPTO")
    private Departamento departamento;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private Set<ObjetivoFundamental> objetivosFundamentales;

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

    public Set<ObjetivoFundamental> getObjetivosFundamentales() {
        return objetivosFundamentales;
    }

    public void setObjetivosFundamentales(Set<ObjetivoFundamental> objetivosFundamentales) {
        this.objetivosFundamentales = objetivosFundamentales;
    }

    @Override
    public String toString() {
        return "Persona [idPersona=" + idPersona + ", identificacion=" + identificacion + ", nombres=" + nombres
                + ", apellidos=" + apellidos + ", fechaNacimiento=" + fechaNacimiento + ", sexo=" + sexo + "]";
    }

}
