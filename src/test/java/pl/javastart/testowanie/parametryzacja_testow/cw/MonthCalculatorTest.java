package pl.javastart.testowanie.parametryzacja_testow.cw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import pl.javastart.testowanie.asercja.MonthCalculator;

import java.time.YearMonth;

public class MonthCalculatorTest {
    private  MonthCalculator monthCalculator = new MonthCalculator();


    @ParameterizedTest
    @CsvSource({
            "2018,6",
            "2019,6",
            "2018,4",
            "2018,9",
            "2010,9",
            "2000,11",
            "2100,11",
    })
    public void shouldReturnDaysNumbers30(int year, int month) {
        // when
        int dayCount = monthCalculator.getDayCount(year, month);

        // then
        Assertions.assertEquals(30, dayCount);
    }



    @ParameterizedTest
    @CsvSource({
            "2018,5",
            "2019,7",
            "2018,8",
            "2018,10",
            "2010,12",
            "2000,3",
            "2100,1",
    })
    public void shouldReturnDaysNumbers31(int year, int month) {
        // when
        int dayCount = monthCalculator.getDayCount(year, month);

        // then
        Assertions.assertEquals(31, dayCount);
    }



    @ParameterizedTest
    @ValueSource(strings = {"2000-02","2004-02","2008-02"})
    public void shouldReturnDaysNumbers29(String YearMonthStr) {
        //given
        YearMonth yearMonth = YearMonth.parse(YearMonthStr);
        // when
        int dayCount = monthCalculator.getDayCount(yearMonth.getYear(), yearMonth.getMonthValue());

        // then
        Assertions.assertEquals(29, dayCount);
    }

    @ParameterizedTest
    @ValueSource(strings = {"2002-02","2005-02","1995-02"})
    public void shouldReturnDaysNumbers28(String YearMonthStr) {
        //given
        YearMonth yearMonth = YearMonth.parse(YearMonthStr);
        // when
        int dayCount = monthCalculator.getDayCount(yearMonth.getYear(), yearMonth.getMonthValue());

        // then
        Assertions.assertEquals(28, dayCount);
    }

}
