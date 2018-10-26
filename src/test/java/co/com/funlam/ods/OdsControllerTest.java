package co.com.funlam.ods;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;

import co.com.funlam.ods.model.ObjetivoEsencial;
import co.com.funlam.ods.model.input.RegistroODSDTO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OdsControllerTest {

    private final Logger logger = LoggerFactory.getLogger(OdsControllerTest.class);

    @Autowired
    private WebApplicationContext context;

    private MockMvc mvc;
    private ObjectMapper objectMapper;

    @Before
    public void setUp() throws Exception {
        this.mvc = webAppContextSetup(context).build();
        objectMapper = new ObjectMapper();
    }

    @Test
    public void contextLoads() {
    }

    @Test
    public void savePersonaTest() throws Exception {
        RegistroODSDTO personaDto = new RegistroODSDTO();
        personaDto.setNombres("BRYAN STEVENS");
        personaDto.setApellidos("BEDOYA ZAPATA");
        personaDto.setFechaNacimiento(new Date());
        personaDto.setSexo("MASCULINO");
        personaDto.setIdentificacion("1020467374");

        personaDto.setIdTipoIdentificacion(Long.valueOf(1));
        personaDto.setIdDepartamento(Long.valueOf(1));
        personaDto.setIdCiudad(Long.valueOf(1));
        personaDto.setIdEducacion(Long.valueOf(6));

        List<co.com.funlam.ods.projection.Objetivo> idObjetivosFundamentales = new ArrayList<>();

        ObjetivoEsencial objetivoEsencial = new ObjetivoEsencial();
        objetivoEsencial.setIdObjetivo(Long.valueOf(1));

        ObjetivoEsencial objetivoEsencial1 = new ObjetivoEsencial();
        objetivoEsencial.setIdObjetivo(Long.valueOf(4));

        ObjetivoEsencial objetivoEsencial2 = new ObjetivoEsencial();
        objetivoEsencial.setIdObjetivo(Long.valueOf(5));

        ObjetivoEsencial objetivoEsencial3 = new ObjetivoEsencial();
        objetivoEsencial.setIdObjetivo(Long.valueOf(6));

        ObjetivoEsencial objetivoEsencial4 = new ObjetivoEsencial();
        objetivoEsencial.setIdObjetivo(Long.valueOf(7));

        ObjetivoEsencial objetivoEsencial5 = new ObjetivoEsencial();
        objetivoEsencial.setIdObjetivo(Long.valueOf(17));

        idObjetivosFundamentales.add(objetivoEsencial);
        idObjetivosFundamentales.add(objetivoEsencial1);
        idObjetivosFundamentales.add(objetivoEsencial2);
        idObjetivosFundamentales.add(objetivoEsencial3);
        idObjetivosFundamentales.add(objetivoEsencial4);
        idObjetivosFundamentales.add(objetivoEsencial5);

        personaDto.setObjetivos(idObjetivosFundamentales);

        String request = objectMapper.writeValueAsString(personaDto);

        logger.debug("request save persona {}", request);

        ResultActions resultActions = this.mvc
                .perform(post("/api/personas").contentType(MediaType.APPLICATION_JSON).content(request))
                .andExpect(status().isOk());
        resultActions.andDo(print());
    }

    @Test
    public void getObjetivosTest() throws Exception {

        ResultActions resultActions = this.mvc.perform(get("/api/objetivos").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());

        String response = resultActions.andReturn().getResponse().getContentAsString();
        logger.debug("getObjetivosTest {}", response);

    }

}
