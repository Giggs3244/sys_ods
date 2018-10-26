package co.com.funlam.ods.service;

import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.funlam.ods.entity.Ciudad;
import co.com.funlam.ods.entity.Departamento;
import co.com.funlam.ods.entity.NivelEducacion;
import co.com.funlam.ods.entity.Objetivo;
import co.com.funlam.ods.entity.ObjetivoFundamental;
import co.com.funlam.ods.entity.Persona;
import co.com.funlam.ods.entity.TipoIdentificacion;
import co.com.funlam.ods.model.ObjetivoEsencial;
import co.com.funlam.ods.model.input.RegistroODSDTO;
import co.com.funlam.ods.repository.PersonaRepository;

@Service
public class RepositoryCommandServiceImpl implements RepositoryCommandService {

    private final Logger logger = LoggerFactory.getLogger(RepositoryCommandServiceImpl.class);
    private final PersonaRepository personaRepository;

    @Autowired
    public RepositoryCommandServiceImpl(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    @Override
    public void crearRegistroODS(RegistroODSDTO registro) {

        Persona persona = new Persona();

        persona.setNombres(registro.getPersona().getNombres());
        persona.setApellidos(registro.getPersona().getApellidos());
        persona.setIdentificacion(registro.getPersona().getIdentificacion());
        persona.setSexo(registro.getPersona().getSexo());
        persona.setFechaNacimiento(registro.getPersona().getFechaNacimiento());

        Departamento departamento = new Departamento();
        departamento.setIdDepartamento(registro.getPersona().getIdDepartamento());
        persona.setDepartamento(departamento);

        Ciudad ciudad = new Ciudad();
        ciudad.setIdCiudad(registro.getPersona().getIdCiudad());
        persona.setCiudad(ciudad);

        TipoIdentificacion tipoId = new TipoIdentificacion();
        tipoId.setIdTipoIdentificacion(registro.getPersona().getIdTipoIdentificacion());
        persona.setTipoIdentificacion(tipoId);

        NivelEducacion nivelEducacion = new NivelEducacion();
        nivelEducacion.setIdEducacion(registro.getPersona().getIdEducacion());
        persona.setNivelEducacion(nivelEducacion);

        Set<ObjetivoFundamental> objetivosFundamentales = new HashSet<>();

        for (ObjetivoEsencial objetivoFund : registro.getObjetivos()) {
            logger.debug("objetivoFund {}", objetivoFund);
            Objetivo objetivo = new Objetivo();
            objetivo.setIdObjetivo(objetivoFund.getIdObjetivo());

            ObjetivoFundamental objetivoFundamental = new ObjetivoFundamental();
            objetivoFundamental.setObjetivo(objetivo);
            objetivoFundamental.setPersona(persona);

            objetivosFundamentales.add(objetivoFundamental);
        }

        persona.setObjetivosFundamentales(objetivosFundamentales);

        logger.debug("saved persona {}", persona);
        logger.debug("saved objetivosFundamentales {}", objetivosFundamentales);

        personaRepository.save(persona);

    }

}
