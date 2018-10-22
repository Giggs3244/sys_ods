package co.com.funlam.ods.service;

import co.com.funlam.ods.model.input.RegistroODSDTO;

public interface RepositoryCommandService {

    public void crearRegistroODS(RegistroODSDTO registroODSDTO);

    public void savePersona(RegistroODSDTO registroODSDTO);

}
