package co.com.funlam.ods.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NivelEducacion {

    @Id
    private
    Long idEducacion;
    private String titulo;

    public Long getIdEducacion() {
        return idEducacion;
    }

    public void setIdEducacion(Long idEducacion) {
        this.idEducacion = idEducacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
