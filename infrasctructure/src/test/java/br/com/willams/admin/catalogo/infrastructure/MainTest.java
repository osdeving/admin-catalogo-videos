package br.com.willams.admin.catalogo.infrastructure;

import br.com.willams.admin.catalogo.infrasctucture.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void testMain() {
        Assertions.assertNotNull(new Main());
        Main.main(new String[]{});
    }
}
