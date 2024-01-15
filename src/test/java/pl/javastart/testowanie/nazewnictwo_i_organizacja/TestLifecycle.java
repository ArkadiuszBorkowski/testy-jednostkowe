package pl.javastart.testowanie.nazewnictwo_i_organizacja;

import org.junit.jupiter.api.*;

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)  => dla klasy testowej ma być tworzona tylko jedna instancja
// domyślnie jest  TestInstance.Lifecycle.PER_METHOD
public class TestLifecycle {

    //@BeforeEach, adnotacja która pozwala na zdefiniowanie, co ma się wykonać przed każdym testem.

    //@AfterEach - metoda oznaczona taką adnotacją zostanie uruchomiona po każdym teście

    //@BeforeAll - metoda zostanie uruchomiona raz przed wszystkimi testami w klasie.
    // Ta metoda musi być zadeklarowana jako statyczna.

    //@AfterAll - metoda zostanie uruchomiona raz, po wszystkimi testami w klasie.
    // Ta metoda musi być zadeklarowana jako statyczna.

    private int licznik = 0;

    @BeforeAll
    public static void initAll() {
        System.out.println("Wykonuje BeforeAll");
    }

    @BeforeEach
    public void init() {
        System.out.println("Wykonuje BeforeEach");
    }

    @Test
    public void test1() {
        System.out.println("Wykonuje test 1. Licznik to: " + licznik);
        licznik = 1;
    }

    @Test
    public void test2() {
        System.out.println("Wykonuje test 2. Licznik to: " + licznik);
        licznik = 2;
    }

    @Test
    public void test3() {
        System.out.println("Wykonuje test 3. Licznik to: " + licznik);
        licznik = 3;
    }

    @AfterEach
    public void after() {
        System.out.println("Wykonuje AfterEach");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Wykonuje AfterAll");
    }
}