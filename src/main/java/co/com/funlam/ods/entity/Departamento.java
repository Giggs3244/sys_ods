package co.com.funlam.ods.entity;

import javax.persistence.*;

@Entity
@Table(name = "DEPARTAMENTO")
public class Departamento {

    @Id
    @Column(name = "IDDPTO")
    private Long idDepartamento;

    @Column(name = "NOMBRE", nullable = false, length = 255)
    private String nombre;

    @Column(name = "CODIGO", nullable = false, length = 255)
    private String codigo;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IDINDICEDLLOHUMANO", nullable = false)
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
