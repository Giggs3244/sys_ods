package co.com.funlam.ods.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OBJETIVO")
public class Objetivo {

    @Id
    @Column(name = "IDOBJETIVO")
    private Long idObjetivo;

    @Column(name = "TITULO", nullable = false, length = 255)
    private String titulo;

    @Column(name = "DESCRIPCION", nullable = false, length = 255)
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
