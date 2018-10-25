package co.com.funlam.ods.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "OBJETIVOFUNDAMENTAL")
public class ObjetivoFundamental {

    @Id
    @TableGenerator(name = "ObjetivoFundamental_Gen", table = "ID_GEN", pkColumnName = "GEN_NAME", valueColumnName = "GEN_VAL", pkColumnValue = "ObjetivoFundamental_Gen", initialValue = 1000, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "ObjetivoFundamental_Gen")
    @Column(name = "IDOBJETIVOFUNDAMENTAL")
    private Long idObjetivoFundamental;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDOBJETIVO", referencedColumnName = "IDOBJETIVO")
    private Objetivo objetivo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDPERSONA", referencedColumnName = "IDPERSONA")
    private Persona persona;

    public Long getIdObjetivoFundamental() {
        return idObjetivoFundamental;
    }

    public void setIdObjetivoFundamental(Long idObjetivoFundamental) {
        this.idObjetivoFundamental = idObjetivoFundamental;
    }

    public Objetivo getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(Objetivo objetivo) {
        this.objetivo = objetivo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "ObjetivoFundamental [idObjetivoFundamental=" + idObjetivoFundamental + "]";
    }

}
