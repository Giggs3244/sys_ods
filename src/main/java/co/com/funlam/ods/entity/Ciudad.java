package co.com.funlam.ods.entity;

import javax.persistence.*;

@Entity
public class Ciudad {

    @Id
    private Long idCiudad;
    private String nombre;
    private String codigo;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idIndiceDlloHumano", nullable = false)
    private IndiceDesarrolloHumano indiceDesarrolloHumano;

    public Long getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(Long idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public IndiceDesarrolloHumano getIndiceDesarrolloHumano() {
        return indiceDesarrolloHumano;
    }

    public void setIndiceDesarrolloHumano(IndiceDesarrolloHumano indiceDesarrolloHumano) {
        this.indiceDesarrolloHumano = indiceDesarrolloHumano;
    }
}
