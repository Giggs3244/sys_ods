package co.com.funlam.ods.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CIUDAD")
public class Ciudad {

    @Id
    @Column(name = "IDCIUDAD")
    private Long idCiudad;

    @Column(name = "NOMBRE", nullable = false, length = 255)
    private String nombre;

    @Column(name = "CODIGO", nullable = false, length = 255)
    private String codigo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDINDICEDLLOHUMANO", referencedColumnName = "IDINDICEDLLOHUMANO")
    private IndiceDesarrolloHumano indiceDesarrolloHumano;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDDEPARTAMENTO", referencedColumnName = "IDDPTO")
    private Departamento departamento;

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
