package pl.javastart.testowanie.asercja.multiasercja;


import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class JUnitMultipleAssertionsTest {

    //AssertJ
    @Test
    void multipleAssertionsAssertJ() {
        Superhero hulk = Superheros.getHulk();
        assertThat(hulk.getAbilities()).contains("superstrength");
        assertThat(hulk.getColor()).isEqualTo("green");
        assertThat(hulk.getPublisher()).isEqualTo("Marvel");
    }

    //Junit5
    @Test
    void multipleAssertionsTogetherWithJunit5andAssertJ() {
        Superhero hulk = Superheros.getHulk();
        assertAll(
                () -> assertThat(hulk.getAbilities()).contains("superstrength"),
                () -> assertThat(hulk.getColor()).isEqualTo("green"),
                () -> assertThat(hulk.getPublisher()).isEqualTo("Marvel")
        );
    }

    @Test
    void multipleAssertionsTogetherWithAssertJ() {
        Superhero hulk = Superheros.getHulk();
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(hulk.getAbilities()).contains("superstrength");
        softAssertions.assertThat(hulk.getColor()).isEqualTo("green");
        softAssertions.assertThat(hulk.getPublisher()).isEqualTo("Marvel");
        softAssertions.assertAll();
    }

}