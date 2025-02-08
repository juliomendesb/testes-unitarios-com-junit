package jmb.studies.junit;


import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNull;
//import static org.junit.jupiter.api.Assertions.assertNotEquals;
//import static org.junit.jupiter.api.Assertions.assertArrayEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTeste {

    @Test
    void validarLancamentos(){

        int[] primeiroLancamento = {10, 20, 30 , 40, 50};
        int[] segundoLancamento = {10, 5 , 2, 3, 10};

        //Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento);
        //Assertions.assertNotEquals(primeiroLancamento, segundoLancamento);
        assertNotEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarSeObjetoEstaNulo(){
        Pessoa pessoa = null;

        //Assertions.assertNull(pessoa);
        assertNull(pessoa);

        pessoa = new Pessoa("Luiciano", LocalDateTime.now());

        //Assertions.assertNotNull(pessoa);
        assertNotNull(pessoa);
    }

    @Test
    void validarNumerosDeTiposDiferentes(){

        double valor = 5.0;
        double outroValor = 5.0;

        //Assertions.assertEquals(valor, outroValor);
        assertEquals(valor, outroValor);
    }
}
