package jmb.studies.junit;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Pessoa {

    private String nome;

    private  LocalDateTime nascimento;

    public Pessoa(String nome, LocalDateTime nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

//    public String getNome() {return nome;}
//
//    public LocalDate getNascimento(){ return nascimento;}

    public int getIdade() {
        return (int) ChronoUnit.YEARS.between(nascimento, LocalDateTime.now());
    }

    public boolean ehMaiorDeIdade(){
        return getIdade() >=18;
    }

}
