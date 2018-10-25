package co.com.funlam.ods.service;

import java.util.List;

import co.com.funlam.ods.projection.Selector;
import co.com.funlam.ods.projection.VotosObjetivo;

public interface RepositoryQueryService {

    public List<Selector> getTiposIdentificacion();

    public List<Selector> getNivelesEducacion();

    public List<Selector> getDepartamentos();

    public List<Selector> getCiudades(Long idDepartamento);

    public List<VotosObjetivo> getCantidadSexo();

    public List<VotosObjetivo> getCantidadNivelEducacion();

    public List<VotosObjetivo> getCantidadIDH();

    public List<VotosObjetivo> getVotosObjetivos();

    public List<VotosObjetivo> getVotosObjetivosByEdad(Integer edad);

    public List<VotosObjetivo> getVotosObjetivosBySexo(String sexo);

    public List<VotosObjetivo> getVotosObjetivosByNivelEducacion(Long idEducacion);

    public List<co.com.funlam.ods.projection.Objetivo> getObjetivos();

    public Integer getCantidadVotosObjetivos();

}
