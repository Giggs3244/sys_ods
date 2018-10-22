package co.com.funlam.ods.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "INDICEDLLOHUMANO")
public class IndiceDesarrolloHumano {

    @Id
    @Column(name = "IDINDICEDLLOHUMANO")
    private Long idIndiceDlloHumano;

    @Column(name = "GRADO", nullable = false, length = 255)
    private String grado;

    public Long getIdIndiceDlloHumano() {
        return idIndiceDlloHumano;
    }

    public void setIdIndiceDlloHumano(Long idIndiceDlloHumano) {
        this.idIndiceDlloHumano = idIndiceDlloHumano;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }
}
