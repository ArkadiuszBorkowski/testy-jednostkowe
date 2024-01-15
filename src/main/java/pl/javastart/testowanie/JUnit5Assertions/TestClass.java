package pl.javastart.testowanie.JUnit5Assertions;

public class TestClass {
    public static void main(String[] args) {
        JUnit5Assertions jUnit5Assertions = new JUnit5Assertions();
        for (int i = 0; i < 100; i++) {
            boolean primeNumber = jUnit5Assertions.isPrimeNumber(i);
            if (primeNumber)
                System.out.println("Liczba " + i + " to liczba pierwsza");
            else {
                System.out.println("Liczba " + i + " nie jest liczbą pierwszą");
            }
        }
    }
}
