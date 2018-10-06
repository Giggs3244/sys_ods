package co.com.funlam.ods.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PercepcionObjetivo {

    @Id
    private Long idPercepcionObjetivo;
    private String descripcion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idPersona", referencedColumnName = "idPersona")
    private Persona persona;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idObjetivo", referencedColumnName = "idObjetivo")
    private Objetivo objetivo;

    public Long getIdPercepcionObjetivo() {
        return idPercepcionObjetivo;
    }

    public void setIdPercepcionObjetivo(Long idPercepcionObjetivo) {
        this.idPercepcionObjetivo = idPercepcionObjetivo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
