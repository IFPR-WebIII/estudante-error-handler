package br.edu.ifpr.estudante_error_handler.services;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.ifpr.estudante_error_handler.exceptions.EstudanteException;
import br.edu.ifpr.estudante_error_handler.models.Estudante;

@SpringBootTest
public class EstudanteServiceUnitTest {

    @Autowired
    private EstudanteService estudanteService;

    @Test
    public void deveCadastrarUmEstudanteComSucesso(){

        //Arrange
        Estudante estudante = new Estudante("John", LocalDate.of(1989, 04, 26), "12181100");

        //Act
        Estudante resultado = estudanteService.cadastrarEstudante(estudante);

        //Assert
        assertThat(resultado).isNotNull();
        assertTrue(resultado.getMatricula().equals("12181100"));

    }

    @Test
    public void deveLancarUmaExcecaoAoCriarEstudantesComMesmaMatricula(){

        //Act
        estudanteService.cadastrarEstudante(estudante);

        assertThrows(EstudanteException.class, () -> {
            estudanteService.cadastrarEstudante(estudante);
        });

    }


    
}
