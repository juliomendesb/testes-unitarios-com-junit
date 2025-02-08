package jmb.studies.junit;

import org.junit.jupiter.api.*;

//OrderAnnotation segue a ordem do modifier Order alocado à cada teste
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//-----------------------------------------------
//MethodName segue os testes em ordem alfabética
//@TestMethodOrder(MethodOrderer.MethodName.class)
//-----------------------------------------------
//Random ordena os testes de maneira aleatória
//@TestMethodOrder(MethodOrderer.Random.class)
//-----------------------------------------------
//DisplayName permite nomear os testes e segue a ordem alfabética dos nomes dados no modifier DisplayName
@TestMethodOrder(MethodOrderer.DisplayName.class)
public class EscolhendoAOrdemTeste {

    //@Order(4)
    @DisplayName("B")
    @Test
    void validaFluxoB(){
        Assertions.assertTrue(true);
    }
    //@Order(3)
    @DisplayName("A")
    @Test
    void validaFluxoA(){
        Assertions.assertTrue(true);
    }
    //@Order(2)
    @DisplayName("C")
    @Test
    void validaFluxoC(){
        Assertions.assertTrue(true);
    }
    //@Order(1)
    @DisplayName("D")
    @Test
    void validaFluxoD(){
        Assertions.assertTrue(true);
    }

}
