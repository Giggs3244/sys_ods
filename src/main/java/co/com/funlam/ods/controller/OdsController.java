package co.com.funlam.ods.controller;

import co.com.funlam.ods.model.input.RegistroODSRequest;
import co.com.funlam.ods.service.RepositoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/api")
@RestController
public class OdsController {

    private Logger logger = LoggerFactory.getLogger("OdsController");
    private final RepositoryService repositoryService;

    @Autowired
    public OdsController(RepositoryService repositoryService) {
        this.repositoryService = repositoryService;
    }

    @PostMapping()
    public ResponseEntity crearRegistroODS(@RequestBody RegistroODSRequest registroODSRequest) {

        return null;
    }

}
