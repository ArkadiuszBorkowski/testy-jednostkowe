package pl.javastart.testowanie.parametryzacja_testow;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class EmailValidatorTest {

    @ParameterizedTest
    @ValueSource(strings = {"example@example.com", "example@gmail.com", "example@example.pl"})
    void shouldBeValidEmail(String email) {
        // given
        EmailValidator emailValidator = new EmailValidator();

        // when
        boolean isValid = emailValidator.isValid(email);

        // then
        assertThat(isValid).isEqualTo(true);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 5, 8, 13})
    void shouldBeFibonacciNumbers(int number) {
        // given
        FibonacciGenerator fibonacciGenerator = new FibonacciGenerator();

        // when
        boolean isFibo = fibonacciGenerator.checkIfFibonacciNumber(number);

        assertThat(isFibo).isTrue();
    }

    @DisplayName("Should be Fibonacci number")
    @ParameterizedTest(name = "{arguments} should be a Fibonacci number")
    @ValueSource(ints = {1, 2, 3, 5, 8, 13})
    void shouldBeFibonacciNumbersWithPrettyName(int number) {
        // given
        FibonacciGenerator fibonacciGenerator = new FibonacciGenerator();

        // when
        boolean isFibo = fibonacciGenerator.checkIfFibonacciNumber(number);

        assertThat(isFibo).isTrue();
    }

}
