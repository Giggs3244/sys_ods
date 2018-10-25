package co.com.funlam.ods.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.com.funlam.ods.model.input.RegistroODSDTO;
import co.com.funlam.ods.projection.Selector;
import co.com.funlam.ods.projection.VotosObjetivo;
import co.com.funlam.ods.service.RepositoryCommandService;
import co.com.funlam.ods.service.RepositoryQueryService;

@CrossOrigin
@RestController
public class OdsController extends BaseController {

    private Logger logger = LoggerFactory.getLogger(OdsController.class);
    private final RepositoryCommandService repositoryCommandService;
    private final RepositoryQueryService repositoryQueryService;

    @Autowired
    public OdsController(RepositoryCommandService repositoryCommandService,
            RepositoryQueryService repositoryQueryService) {
        this.repositoryCommandService = repositoryCommandService;
        this.repositoryQueryService = repositoryQueryService;
    }

    @PostMapping(value = "/personas")
    public void crearRegistroODS(@RequestBody RegistroODSDTO registroODSDTO) {
        logger.debug("crearRegistroODS registroODSDTO {}", registroODSDTO);
        repositoryCommandService.crearRegistroODS(registroODSDTO);
    }

    @GetMapping(value = "/ciudades")
    public List<Selector> getCiudades(@RequestParam(value = "idDpto", required = true) Long idDpto) {
        logger.debug("getCiudades idDpto {}", idDpto);
        return repositoryQueryService.getCiudades(idDpto);
    }

    @GetMapping(value = "/departamentos")
    public List<Selector> getDepartamentos() {
        logger.debug("getDepartamentos {}", 0);
        return repositoryQueryService.getDepartamentos();
    }

    @GetMapping(value = "/niveles-educacion")
    public List<Selector> getNivelesEducacion() {
        logger.debug("getNivelesEducacion {}", 0);
        return repositoryQueryService.getNivelesEducacion();
    }

    @GetMapping(value = "/tipos-identificacion")
    public List<Selector> getTiposIdentificacion() {
        logger.debug("getTiposIdentificacion {}", 0);
        return repositoryQueryService.getTiposIdentificacion();
    }

    @GetMapping(value = "/objetivos")
    public List<co.com.funlam.ods.projection.Objetivo> getObjetivos() {
        logger.debug("getObjetivos {}", 0);
        return repositoryQueryService.getObjetivos();
    }

    @GetMapping(value = "/cantidad-votos")
    public Integer getCantidadVotosObjetivos() {
        logger.debug("getCantidadVotosObjetivos {}", 0);
        return repositoryQueryService.getCantidadVotosObjetivos();
    }

    @GetMapping(value = "/cantidad-sexo")
    public List<VotosObjetivo> getCantidadSexo() {
        logger.debug("getCantidadSexo {}", 0);
        return repositoryQueryService.getCantidadSexo();
    }

    @GetMapping(value = "/cantidad-nivel-educacion")
    public List<VotosObjetivo> getCantidadNivelEducacion() {
        logger.debug("getCantidadNivelEducacion {}", 0);
        return repositoryQueryService.getCantidadNivelEducacion();
    }

    @GetMapping(value = "/cantidad-idh")
    public List<VotosObjetivo> getCantidadIDH() {
        logger.debug("getCantidadIDH {}", 0);
        return repositoryQueryService.getCantidadIDH();
    }

    @GetMapping(value = "/votos-objetivos")
    public List<VotosObjetivo> getVotosObjetivos() {
        logger.debug("getVotosObjetivos {}", 0);
        return repositoryQueryService.getVotosObjetivos();
    }

    @GetMapping(value = "/votos-objetivos-edad")
    public List<VotosObjetivo> getVotosObjetivosByEdad(@RequestParam(value = "edad", required = true) Integer edad) {
        logger.debug("getVotosObjetivosByEdad edad {}", edad);
        return repositoryQueryService.getVotosObjetivosByEdad(edad);
    }

    @GetMapping(value = "/votos-objetivos-sexo")
    public List<VotosObjetivo> getVotosObjetivosBySexo(@RequestParam(value = "sexo", required = true) String sexo) {
        logger.debug("getVotosObjetivosBySexo sexo {}", sexo);
        return repositoryQueryService.getVotosObjetivosBySexo(sexo);
    }

    @GetMapping(value = "/votos-objetivos-nivel-educacion")
    public List<VotosObjetivo> getVotosObjetivosByNivelEducacion(
            @RequestParam(value = "idEducacion", required = true) Long idEducacion) {
        logger.debug("getVotosObjetivosByNivelEducacion idEducacion {}", idEducacion);
        return repositoryQueryService.getVotosObjetivosByNivelEducacion(idEducacion);
    }

}
