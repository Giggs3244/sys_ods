package co.com.funlam.ods.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.funlam.ods.projection.Selector;
import co.com.funlam.ods.projection.VotosObjetivo;
import co.com.funlam.ods.repository.MiscellaneousRepository;
import co.com.funlam.ods.repository.ObjetivoRepository;
import co.com.funlam.ods.repository.PersonaRepository;

@Service
public class RepositoryQueryServiceImpl implements RepositoryQueryService {

    private final MiscellaneousRepository miscellaneousRepository;
    private final ObjetivoRepository objetivoRepository;
    private final PersonaRepository personaRepository;

    @Autowired
    public RepositoryQueryServiceImpl(MiscellaneousRepository miscellaneousRepository,
            ObjetivoRepository objetivoRepository, PersonaRepository personaRepository) {
        this.miscellaneousRepository = miscellaneousRepository;
        this.objetivoRepository = objetivoRepository;
        this.personaRepository = personaRepository;
    }

    @Override
    public List<Selector> getTiposIdentificacion() {
        return miscellaneousRepository.getTiposIdentificacion();
    }

    @Override
    public List<Selector> getNivelesEducacion() {
        return miscellaneousRepository.getNivelesEducacion();
    }

    @Override
    public List<Selector> getDepartamentos() {
        return miscellaneousRepository.getDepartamentos();
    }

    @Override
    public List<Selector> getCiudades(Long idDepartamento) {
        return miscellaneousRepository.getCiudades(idDepartamento);
    }

    @Override
    public List<VotosObjetivo> getCantidadSexo() {
        return personaRepository.getCantidadSexo();
    }

    @Override
    public List<VotosObjetivo> getCantidadNivelEducacion() {
        return personaRepository.getCantidadNivelEducacion();
    }

    @Override
    public List<VotosObjetivo> getCantidadIDH() {
        return personaRepository.getCantidadIDH();
    }

    @Override
    public List<co.com.funlam.ods.projection.Objetivo> getObjetivos() {
        return objetivoRepository.getObjetivos();
    }

    @Override
    public List<VotosObjetivo> getVotosObjetivos() {
        return objetivoRepository.getVotosObjetivos();
    }

    @Override
    public Integer getCantidadVotosObjetivos() {
        return objetivoRepository.getCantidadVotosObjetivos();
    }

    @Override
    public List<VotosObjetivo> getVotosObjetivosByEdad(Integer edad) {
        return objetivoRepository.getVotosObjetivosByEdad(edad);
    }

    @Override
    public List<VotosObjetivo> getVotosObjetivosBySexo(String sexo) {
        return objetivoRepository.getVotosObjetivosBySexo(sexo);
    }

    @Override
    public List<VotosObjetivo> getVotosObjetivosByNivelEducacion(Long idEducacion) {
        return objetivoRepository.getVotosObjetivosByNivelEducacion(idEducacion);
    }

}
