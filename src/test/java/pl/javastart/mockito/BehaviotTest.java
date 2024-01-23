package pl.javastart.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import pl.javastart.mockito.cechy.User;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

public class BehaviotTest {

    @Test
    public void shouldAlwaysReturnGivenName() {
        User user = Mockito.mock(User.class);

        Mockito.when(user.getName()).thenReturn("Kasia");

        assertThat(user.getName()).isEqualTo("Kasia");
        assertThat(user.getName()).isEqualTo("Kasia");
        assertThat(user.getName()).isEqualTo("Kasia");
    }

    @Test
    public void testMockitoWhenValues() {
        User user = Mockito.mock(User.class);

        Mockito.when(user.getName()).thenReturn("Kasia", "Basia", "Krysia");

        assertThat(user.getName()).isEqualTo("Kasia");
        assertThat(user.getName()).isEqualTo("Basia");
        assertThat(user.getName()).isEqualTo("Krysia");
        assertThat(user.getName()).isEqualTo("Krysia");
        assertThat(user.getName()).isEqualTo("Krysia");
    }

    @Test
    public void shouldAlwaysReturnGivenNameLazyWay() {
        User user = Mockito.mock(User.class);

        Mockito.when(user.getName()).then(i -> {
            System.out.println("Liczenie wartości wynikowej");
            return "Kasia";
        });

        System.out.println("Zaraz będę sprawdzał po raz #1");
        assertThat(user.getName()).isEqualTo("Kasia");
        System.out.println("Zaraz będę sprawdzał po raz #2");
        assertThat(user.getName()).isEqualTo("Kasia");
        System.out.println("Zaraz będę sprawdzał po raz #3");
        assertThat(user.getName()).isEqualTo("Kasia");
    }

}
