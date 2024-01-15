package pl.javastart.testowanie.JUnit5Assertions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JUnit5AssertionsTest {

    JUnit5Assertions sut = new JUnit5Assertions();

    @DisplayName("check whether the number 6 is not a prime number ")
    @Test
    public void CheckIFNumber6IsPrimeNumbers() {
        //given
        int number = 6;
        //then
        Assertions.assertFalse(sut.isPrimeNumber(number));
    }

    @DisplayName("check whether the number 1 is a prime number ")
    @Test
    public void CheckIFNumber1IsPrimeNumbers() {
        //given
        int number = 1;

        //then
        Assertions.assertTrue(sut.isPrimeNumber(number));
    }

    @DisplayName("check whether the number 11 is a prime number ")
    @Test
    public void CheckIFNumber11IsPrimeNumbers() {
        //given
        int number = 11;

        //then
        Assertions.assertTrue(sut.isPrimeNumber(number));
    }

    @DisplayName("check whether the number 41 is a prime number ")
    @Test
    public void CheckIFNumber41IsPrimeNumbers() {
        //given
        int number = 41;

        //then
        Assertions.assertTrue(sut.isPrimeNumber(number));
    }

    @DisplayName("check whether the number 33 is not a prime number ")
    @Test
    public void CheckIFNumber33IsPrimeNumbers() {
        //given
        int number = 33;

        //then
        Assertions.assertFalse(sut.isPrimeNumber(number));
    }

    @DisplayName("check whether the number 47 is a prime number ")
    @Test
    public void CheckIFNumber47IsPrimeNumbers() {
        //given
        int number = 47;

        //then
        Assertions.assertTrue(sut.isPrimeNumber(number));
    }

    @Test
    public void shouldReturnValidCode() {
        // when
        JUnit5Assertions.Code code = sut.getCode("a");

        // then
        Assertions.assertEquals("a", code.getKey());
        Assertions.assertNotNull(code.getCreatedAtTimestamp());
        Assertions.assertNotNull(code.getCode());
    }

    @Test
    public void shouldReturnSameObjects() {
        // when
        JUnit5Assertions.Code code = sut.getCode("a");
        JUnit5Assertions.Code code2 = sut.getCode("a");

        // then
        Assertions.assertSame(code, code2);
    }

    @Test
    public void shouldReturnDifferentObjects() {
        // when
        JUnit5Assertions.Code code = sut.getCode("a");
        JUnit5Assertions.Code code2 = sut.getCode("b");

        // then
        Assertions.assertNotSame(code, code2);
    }

}
