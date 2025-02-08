package jmb.studies.junit;

import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class ConsultarDadosDePessoaTest {

    @BeforeAll
    static void configuraConexao() {
        GerenciadorDeConexaoComBancoDeDados.iniciarConexao();
        //System.out.println("rodou configuraConexao");
    }

    @BeforeEach
    void insereDadosParaTeste(){
        GerenciadorDeConexaoComBancoDeDados.insereDados(new Pessoa("João", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
    }

    @AfterEach
    void removeDadosDoTeste(){
        GerenciadorDeConexaoComBancoDeDados.removeDados(new Pessoa("João", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
    }

    @Test
    void validarDadosDeRetorno() {
        Assertions.assertTrue(true);
    }

    @Test
    void validarDadosDeRetorno2() {
        Assertions.assertNull(null);
    }

    @AfterAll
    static void finalizarConexao() {
        GerenciadorDeConexaoComBancoDeDados.finalizarConexao();
        //System.out.println("rodou finalizarConexao");
    }
}