package co.com.funlam.ods.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.com.funlam.ods.model.input.RegistroODSDTO;
import co.com.funlam.ods.service.RepositoryCommandService;

@RestController
public class OdsController extends BaseController {

    private Logger logger = LoggerFactory.getLogger(OdsController.class);
    private final RepositoryCommandService repositoryCommandService;

    @Autowired
    public OdsController(RepositoryCommandService repositoryCommandService) {
        this.repositoryCommandService = repositoryCommandService;
    }
/*
    @PostMapping(name = "/registro")
    public void crearRegistroODS(@RequestBody RegistroODSDTO registroODSDTO) {
        logger.debug("crearRegistroODS registroODSDTO {}", registroODSDTO);
    }*/

    @PostMapping(value = "/personas")
    public void savePersona(@RequestBody RegistroODSDTO registroODSDTO) {
        logger.debug("savePersona registroODSDTO {}", registroODSDTO);
        repositoryCommandService.savePersona(registroODSDTO);
    }

}
