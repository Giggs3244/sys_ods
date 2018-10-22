package co.com.funlam.ods.service;

import co.com.funlam.ods.entity.*;
import co.com.funlam.ods.model.input.RegistroODSDTO;
import co.com.funlam.ods.repository.PersonaRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RepositoryCommandServiceImpl implements RepositoryCommandService {

    private final Logger logger = LoggerFactory.getLogger(RepositoryCommandServiceImpl.class);
    private final PersonaRepository personaRepository;

    @Autowired
    public RepositoryCommandServiceImpl(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    @Override
    public void crearRegistroODS(RegistroODSDTO registroODSDTO) {

    }

    @Override
    public void savePersona(RegistroODSDTO registroODSDTO) {
        Persona persona = new Persona();

        persona.setNombres(registroODSDTO.getNombres());
        persona.setApellidos(registroODSDTO.getApellidos());
        persona.setIdentificacion(registroODSDTO.getIdentificacion());
        persona.setSexo(registroODSDTO.getSexo());
        persona.setFechaNacimiento(registroODSDTO.getFechaNacimiento());

        Departamento departamento = new Departamento();
        departamento.setIdDepartamento(registroODSDTO.getIdDepartamento());
        persona.setDepartamento(departamento);

        Ciudad ciudad = new Ciudad();
        ciudad.setIdCiudad(registroODSDTO.getIdCiudad());
        persona.setCiudad(ciudad);

        TipoIdentificacion tipoId = new TipoIdentificacion();
        tipoId.setIdTipoIdentificacion(registroODSDTO.getIdTipoIdentificacion());
        persona.setTipoIdentificacion(tipoId);

        NivelEducacion nivelEducacion = new NivelEducacion();
        nivelEducacion.setIdEducacion(registroODSDTO.getIdEducacion());
        persona.setNivelEducacion(nivelEducacion);

        personaRepository.save(persona);
        logger.debug("saved persona {}", persona);
    }
}
