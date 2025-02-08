package jmb.studies.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

class PessoaTest {

//    @Test
//    void validarCalculoDeIdade(){
//        Pessoa pessoa = new Pessoa( "julia", LocalDate.of(2023, 1, 1));
//        Assertions.assertEquals(2, pessoa.getIdade());
//    }

    @Test //--> Anotação é primordial para testar
    void deveCalcularIdadeCorretamente() {
        Pessoa jessica = new Pessoa("Jéssica", LocalDateTime.of(2000, 1, 1, 15, 0, 0)); //--> Cria um cenário
        Assertions.assertEquals(25, jessica.getIdade()); //--> Executa as validações
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade(){
        Pessoa jessica = new Pessoa("Jéssica", LocalDateTime.of(2000, 1, 1, 15, 0, 0));
        Assertions.assertTrue(jessica.ehMaiorDeIdade());

        Pessoa joao = new Pessoa("João", LocalDateTime.now());
        Assertions.assertFalse(joao.ehMaiorDeIdade());
    }


}