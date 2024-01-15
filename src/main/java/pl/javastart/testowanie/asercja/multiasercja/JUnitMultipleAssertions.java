package pl.javastart.testowanie.asercja.multiasercja;

public class JUnitMultipleAssertions {

    //W AssertJ do uruchomienia wszystkich asercji korzysta się z SoftAssertions. Przerobienie powyższego testu wygląda następująco:

   /** @Test
    void shouldCorrectlyCreateHulk() {
        Superhero hulk = Superheros.getHulk();
        assertThat(hulk.getAbilities()).contains("intelligence");
        assertThat(hulk.getColor()).isEqualTo("blue");
        assertThat(hulk.getPublisher()).isEqualTo("Disney");
   */

//    Powyższy test sprawdza jedną rzecz: czy poprawnie tworzony jest obiekt reprezentujący Hulka.
//    Test ten zawiera 3 asercje, co w tym przypadku jest uzasadnione.
//    Teoretycznie można go rozbić na 3 osobne testy, ale moim zdaniem byłby to przerost formy nad treścią.
//
//    Domyślnie testy jest wykonywany do momentu znalezienia pierwszego błędu.
//    Wtedy jest przerywany. Jeśli test posiada kilka asercji to komunikat z błędem będzie zawierał wynik tylko jednej asercji.
//    Uruchomienie powyższego przykładu spowoduje wyświetlenie następującego komunikatu:
//

//    W AssertJ do uruchomienia wszystkich asercji korzysta się z SoftAssertions.
//    SoftAssertions softAssertions = new SoftAssertions();

}
