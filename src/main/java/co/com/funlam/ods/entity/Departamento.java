package co.com.funlam.ods.entity;

import javax.persistence.*;

@Entity
public class Departamento {

    @Id
    private Long idDepartamento;
    private String nombre;
    private String codigo;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idIndiceDlloHumano", nullable = false)
    private IndiceDesarrolloHumano indiceDesarrolloHumano;

    public Long getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Long idDepartamento) {
        this.idDepartamento = idDepartamento;
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
