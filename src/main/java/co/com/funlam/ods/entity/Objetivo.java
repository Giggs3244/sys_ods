package co.com.funlam.ods.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Objetivo {

    @Id
    private
    Long idObjetivo;
    private String titulo;
    private String descripcion;

    public Long getIdObjetivo() {
        return idObjetivo;
    }

    public void setIdObjetivo(Long idObjetivo) {
        this.idObjetivo = idObjetivo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
