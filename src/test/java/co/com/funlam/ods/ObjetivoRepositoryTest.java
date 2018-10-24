package co.com.funlam.ods;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import co.com.funlam.ods.projection.VotosObjetivo;
import co.com.funlam.ods.repository.ObjetivoRepository;
import co.com.funlam.ods.repository.PersonaRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ObjetivoRepositoryTest {

    private final Logger logger = LoggerFactory.getLogger(ObjetivoRepositoryTest.class);

    @Autowired
    private ObjetivoRepository objetivoRepository;

    @Autowired
    private PersonaRepository personaRepository;

    @Test
    public void contextLoads() {
    }

    @Test
    public void getVotosObjetivos() {

        List<VotosObjetivo> votosByObjetivo = objetivoRepository.getVotosObjetivos();

        logger.debug("getVotosObjetivos");
        for (VotosObjetivo votoObjetivo : votosByObjetivo) {
            logger.debug("Titulo del objetivo {} cantidad de votos {}", votoObjetivo.getTitulo(),
                    votoObjetivo.getCantidadVotos());
        }

    }

    @Test
    public void getVotosObjetivosByNivelEducacion() {

        List<VotosObjetivo> votosByObjetivo = objetivoRepository.getVotosObjetivosByNivelEducacion(Long.valueOf(5));

        logger.debug("getVotosObjetivosByNivelEducacion");
        for (VotosObjetivo votoObjetivo : votosByObjetivo) {
            logger.debug("Titulo del objetivo {} cantidad de votos {}", votoObjetivo.getTitulo(),
                    votoObjetivo.getCantidadVotos());
        }

    }

    @Test
    public void getVotosObjetivosBySexo() {

        List<VotosObjetivo> votosByObjetivo = objetivoRepository.getVotosObjetivosBySexo("MASCULINO");

        logger.debug("getVotosObjetivosBySexo");
        for (VotosObjetivo votoObjetivo : votosByObjetivo) {
            logger.debug("Titulo del objetivo {} cantidad de votos {}", votoObjetivo.getTitulo(),
                    votoObjetivo.getCantidadVotos());
        }

    }

    @Test
    public void getVotosObjetivosByEdad() {

        List<VotosObjetivo> votosByObjetivo = objetivoRepository.getVotosObjetivosByEdad(20);

        logger.debug("getVotosObjetivosByEdad");
        for (VotosObjetivo votoObjetivo : votosByObjetivo) {
            logger.debug("Titulo del objetivo {} cantidad de votos {}", votoObjetivo.getTitulo(),
                    votoObjetivo.getCantidadVotos());
        }

    }

    @Test
    public void getCantidadVotosObjetivos() {

        Integer cantidad = objetivoRepository.getCantidadVotosObjetivos();

        logger.debug("getCantidadVotosObjetivos");
        logger.debug("Cantidad de votos {}", cantidad);

    }

    @Test
    public void getCantidadSexo() {

        List<VotosObjetivo> votosByObjetivo = personaRepository.getCantidadSexo();

        logger.debug("getCantidadSexo");
        for (VotosObjetivo votoObjetivo : votosByObjetivo) {
            logger.debug("Sexo {} cantidad de votos {}", votoObjetivo.getTitulo(), votoObjetivo.getCantidadVotos());
        }

    }

    @Test
    public void getCantidadNivelEducacion() {

        List<VotosObjetivo> votosByObjetivo = personaRepository.getCantidadNivelEducacion();

        logger.debug("getCantidadNivelEducacion");
        for (VotosObjetivo votoObjetivo : votosByObjetivo) {
            logger.debug("Nivel Educacion {} cantidad de votos {}", votoObjetivo.getTitulo(),
                    votoObjetivo.getCantidadVotos());
        }

    }

    @Test
    public void getCantidadIDH() {

        List<VotosObjetivo> votosByObjetivo = personaRepository.getCantidadIDH();

        logger.debug("getCantidadIDH");
        for (VotosObjetivo votoObjetivo : votosByObjetivo) {
            logger.debug("Indice desarrollo humano {} cantidad de votos {}", votoObjetivo.getTitulo(),
                    votoObjetivo.getCantidadVotos());
        }

    }

}
