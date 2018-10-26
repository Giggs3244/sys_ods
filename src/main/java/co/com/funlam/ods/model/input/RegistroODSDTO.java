package co.com.funlam.ods.model.input;

import java.util.List;

import co.com.funlam.ods.model.ObjetivoEsencial;
import co.com.funlam.ods.model.PercepcionObjetivoDTO;
import co.com.funlam.ods.model.PersonaDTO;

public class RegistroODSDTO {

    private PersonaDTO persona;
    private List<PercepcionObjetivoDTO> percepcionesObjetivos;
    private List<ObjetivoEsencial> objetivos;

    public List<PercepcionObjetivoDTO> getPercepcionesObjetivos() {
        return percepcionesObjetivos;
    }

    public void setPercepcionesObjetivos(List<PercepcionObjetivoDTO> percepcionesObjetivos) {
        this.percepcionesObjetivos = percepcionesObjetivos;
    }

    public List<ObjetivoEsencial> getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(List<ObjetivoEsencial> objetivos) {
        this.objetivos = objetivos;
    }

    public PersonaDTO getPersona() {
        return persona;
    }

    public void setPersona(PersonaDTO persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "RegistroODSDTO [persona=" + persona + ", percepcionesObjetivos=" + percepcionesObjetivos
                + ", objetivos=" + objetivos + ", toString()=" + super.toString() + "]";
    }

}
