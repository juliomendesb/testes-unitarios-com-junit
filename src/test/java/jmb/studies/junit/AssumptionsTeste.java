package jmb.studies.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTeste {

    @Test
    void validarAlgoSomenteNoUsuarioJulio() {
        //System.out.println(System.getenv("USERNAME"));
        Assumptions.assumeTrue("julio".equals(System.getenv("USERNAME")));
        Assumptions.assumeFalse("root".equals(System.getenv("USERNAME")));
        Assertions.assertEquals(10, 5+5);
    }
}
