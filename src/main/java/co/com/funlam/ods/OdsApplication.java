package co.com.funlam.ods;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import co.com.funlam.ods.entity.TipoIdentificacion;
import co.com.funlam.ods.repository.TipoIdentificacionRepository;

@SpringBootApplication
public class OdsApplication implements CommandLineRunner {

    private Logger log = LoggerFactory.getLogger("OdsApplication");

    private final TipoIdentificacionRepository tipoIdentificacionRepository;

    @Autowired
    public OdsApplication(TipoIdentificacionRepository tipoIdentificacionRepository) {
        this.tipoIdentificacionRepository = tipoIdentificacionRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(OdsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        TipoIdentificacion tipoId = new TipoIdentificacion();
        tipoId.setIdTipoIdentificacion(1L);
        tipoId.setValor("CC");
        tipoId.setTexto("Cédula de Ciudadanía");

        log.info("Inserting data in DB.");
        tipoIdentificacionRepository.save(tipoId);

        log.info("User count in DB: {}", tipoIdentificacionRepository.count());
        log.info("User with ID 1: {}", tipoIdentificacionRepository.findById(1L));

    }
}
