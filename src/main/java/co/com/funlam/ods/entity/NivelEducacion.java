package co.com.funlam.ods.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NIVELEDUCACION")
public class NivelEducacion {

    @Id
    @Column(name = "IDEDUCACION")
    private Long idEducacion;

    @Column(name = "TITULO", nullable = false, length = 255)
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
