package co.com.funlam.ods.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class IndiceDesarrolloHumano {

    @Id
    private Long idIndiceDlloHumano;
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
