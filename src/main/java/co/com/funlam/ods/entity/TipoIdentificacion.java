package co.com.funlam.ods.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TipoIdentificacion {

    @Id
    private
    Long idTipoIdentificacion;
    private String valor;
    private String descripcion;

    public Long getIdTipoIdentificacion() {
        return idTipoIdentificacion;
    }

    public void setIdTipoIdentificacion(Long idTipoIdentificacion) {
        this.idTipoIdentificacion = idTipoIdentificacion;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
