package pl.javastart.testowanie.JUnit5Assertions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JUnitTest {

    @Test
    public void testNormal() {
        String name = "";
        Assertions.assertNotNull(name, getErrorMessage());
    }

    @Test
    public void testSupplier() {
        String name = "";
        Assertions.assertNotNull(name, () -> getErrorMessage());
    }

    private String getErrorMessage() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Name cannot be null";
    }
}
