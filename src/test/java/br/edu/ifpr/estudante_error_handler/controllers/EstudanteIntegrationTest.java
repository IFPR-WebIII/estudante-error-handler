package br.edu.ifpr.estudante_error_handler.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class EstudanteIntegrationTest {

    @Autowired
    private MockMvc mockRequest;

    public void deRetornarAViewDeCadastroDoEstudate(){

        mockRequest.perform(get("/estudantes"))
        

    }
    
}
