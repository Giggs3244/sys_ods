package co.com.funlam.ods;

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

        List<Long> idObjetivosFundamentales = new ArrayList<>();
        idObjetivosFundamentales.add(Long.valueOf(1));
        idObjetivosFundamentales.add(Long.valueOf(4));
        idObjetivosFundamentales.add(Long.valueOf(5));
        idObjetivosFundamentales.add(Long.valueOf(6));
        idObjetivosFundamentales.add(Long.valueOf(7));
        idObjetivosFundamentales.add(Long.valueOf(17));

        personaDto.setIdObjetivosFundamentales(idObjetivosFundamentales);

        String request = objectMapper.writeValueAsString(personaDto);

        logger.debug("request save persona {}", request);

        ResultActions resultActions = this.mvc
                .perform(post("/api/personas").contentType(MediaType.APPLICATION_JSON).content(request))
                .andExpect(status().isOk());
        resultActions.andDo(print());
    }

}
