package co.com.funlam.ods.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class ObjetivoFundamental {

    @Id
    private Long idObjetivoFundamental;
    private Date fechaRegistro;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idPersona", referencedColumnName = "idPersona")
    private Persona persona;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idObjetivo", referencedColumnName = "idObjetivo")
    private Objetivo objetivo;

    public Long getIdObjetivoFundamental() {
        return idObjetivoFundamental;
    }

    public void setIdObjetivoFundamental(Long idObjetivoFundamental) {
        this.idObjetivoFundamental = idObjetivoFundamental;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Objetivo getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(Objetivo objetivo) {
        this.objetivo = objetivo;
    }
}
