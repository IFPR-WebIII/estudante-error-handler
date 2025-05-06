package br.edu.ifpr.estudante_error_handler.services;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.ifpr.estudante_error_handler.models.Estudante;

@SpringBootTest
public class EstudanteServiceUnitTest {

    @Autowired
    EstudanteService service;

    @Test
    public void deveCadastrarUmEstudanteComSucesso(){

        //Arrange
        Estudante e1 = new Estudante("Jefferson", LocalDate.of(1989, 04, 26), "12181100");
         
        //Act
        Estudante resultado = service.cadastrarEstudante(e1);

        System.out.println("elementos na lista" + service.buscarTodos().size());

        //Assert
        assertThat(resultado).isNotNull();
        assertTrue(resultado.getMatricula().equals("12181100"));

    }
    
}
