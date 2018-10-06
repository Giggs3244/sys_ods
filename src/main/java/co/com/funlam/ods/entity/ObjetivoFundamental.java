package co.com.funlam.ods.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ObjetivoFundamental {

    @Id
    private Long idObjetivoFundamental;
    private LocalDateTime fechaRegistro;

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

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
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
