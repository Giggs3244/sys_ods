package co.com.funlam.ods.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TIPOIDENTIFICACION")
public class TipoIdentificacion {

    @Id
    @Column(name = "IDTIPOID")
    private Long idTipoIdentificacion;

    @Column(name = "VALOR", nullable = false, length = 255)
    private String valor;

    @Column(name = "TEXTO", nullable = false, length = 255)
    private String texto;

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

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
