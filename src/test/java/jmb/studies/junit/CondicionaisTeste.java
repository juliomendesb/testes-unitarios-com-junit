package jmb.studies.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class CondicionaisTeste {

    @Test
    //@EnabledIfEnvironmentVariable(named = "USERNAME", matches = "julio")
    //@DisabledIfEnvironmentVariable(named = "USERNAME", matches = "julio")
    //@EnabledOnOs(OS.LINUX)
    @EnabledOnOs(OS.WINDOWS)
    void validarAlgoSomenteNoUsuarioJulio() {
        //System.out.println(System.getenv("USERNAME"));
        //Assumptions.assumeTrue("julio".equals(System.getenv("USERNAME")));
        //Assumptions.assumeFalse("root".equals(System.getenv("USERNAME")));
        Assertions.assertEquals(10, 5+5);
    }


}
