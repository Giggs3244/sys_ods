package co.com.funlam.ods;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
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
        personaDto.setNombres("Bryan Stevens");
        personaDto.setApellidos("Bedoya Zapata");
        personaDto.setFechaNacimiento(new Date());
        personaDto.setSexo("Masculino");
        personaDto.setIdentificacion("1020467374");

        personaDto.setIdTipoIdentificacion(Long.valueOf(1));
        personaDto.setIdDepartamento(Long.valueOf(1));
        personaDto.setIdCiudad(Long.valueOf(1));
        personaDto.setIdEducacion(Long.valueOf(6));

        String request = objectMapper.writeValueAsString(personaDto);

        ResultActions resultActions = this.mvc
                .perform(post("/api/personas").contentType(MediaType.APPLICATION_JSON).content(request))
                .andExpect(status().isOk());
        resultActions.andDo(print());
    }

}
