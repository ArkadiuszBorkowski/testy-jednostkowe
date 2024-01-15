package pl.javastart.testowanie.asercja;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

//przykłąd statycznego importu metod i biblioteka do testowania AssertJ

class AssertJIntroTest {

    @Test
    public void example() {
        String name = "Dorota";
        String name2 = "Marzena";

        assertThat(name.equals(name2));
    }

}