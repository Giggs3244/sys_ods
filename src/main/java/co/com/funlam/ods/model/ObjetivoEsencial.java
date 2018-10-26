package co.com.funlam.ods.model;

import co.com.funlam.ods.projection.Objetivo;

public class ObjetivoEsencial implements Objetivo {

    private Long idObjetivo;
    private String titulo;
    private String descripcion;

    @Override
    public Long getIdObjetivo() {
        return idObjetivo;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    public void setIdObjetivo(Long idObjetivo) {
        this.idObjetivo = idObjetivo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "ObjetivoEsencial [idObjetivo=" + idObjetivo + ", titulo=" + titulo + ", descripcion=" + descripcion
                + "]";
    }

}
