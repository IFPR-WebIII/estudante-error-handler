package br.edu.ifpr.estudante_error_handler.models;

import java.time.LocalDate;

import org.hibernate.validator.constraints.br.CPF; 

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Estudante {

    @NotNull(message = "o nome não pode estar vazio")
    @Size(min = 1, max = 25, message = "O nome deve possuir no máximo 25 caracteres")
    private String nome;

    private LocalDate dataNascimento;

    @Size(min = 8, max = 8, message = "o tamanho de matricula deve ser de 8 caracteres")
    private String matricula;

    @CPF
    private String CPF;
    
    public Estudante(){}

    public Estudante(String nome, LocalDate dataNascimento, String matricula) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

}
