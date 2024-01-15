package pl.javastart.testowanie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void shouldAdd5To6AndResult11() {
        //given
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 6;

        //when
        int result = calculator.add(a, b);

        //then
        Assertions.assertEquals(11, result);
    }

    @Test
    public void shouldAdd2To3AndResult5() {
        //given
        Calculator calculator = new Calculator();
        int a = 2;
        int b = 3;

        //when
        int result = calculator.add(a, b);

        //then
        Assertions.assertEquals(result, 5);
    }
}