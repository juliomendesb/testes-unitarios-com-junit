package jmb.studies.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {

    @Test
    void validarCenarioDeExcecaoNaTransferencia(){
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("456548", 100);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        //Espera uma exceção
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));
        //Não espera uma exceção
        Assertions.assertDoesNotThrow(() -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, 20));
    }
}
