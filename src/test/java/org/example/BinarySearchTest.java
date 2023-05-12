package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class BinarySearchTest {

    @ParameterizedTest
    @CsvSource({
            "10, 0",
            "20, 1",
            "30, 2",
            "40, 3",
            "50, 4",
            "60, 5",
            "70, 6",
            "90, 8",
            "100, 9",
            "101, -1"
    })
    public void search_FindElInIntArr(int searchingNum, int expectedPos) {
        List<Integer> list = List.of(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);

        var res = BinarySearch.search(list, searchingNum);

        assertEquals(expectedPos, res);
    }

    @ParameterizedTest
    @CsvSource({
            "apple, 0",
            "banana, 1",
            "cherry, 2",
            "date, 3",
            "fig, 4",
            "grape, 5"})
    public void search_FindElInStrArr(String searchingStr, int expectedPos) {
        List<String> list = List.of("apple", "banana", "cherry", "date", "fig", "grape");

        var res = BinarySearch.search(list, searchingStr);

        assertEquals(expectedPos, res);
    }

    @Test
    void search_FindElInDateArr() {
        Date d1 = new Date(2021, Calendar.NOVEMBER, 1);
        Date d2 = new Date(2022, Calendar.JUNE, 10);
        Date d3 = new Date(2023, Calendar.APRIL, 15);
        List<Date> dates = new ArrayList<>();
        dates.add(d1);
        dates.add(d2);
        dates.add(d3);

        var res = BinarySearch.search(dates, d2);

        assertEquals(1, res);
    }

    @Test
    void search_FindElInDoubleArr() {
        Double d1 = 1.2;
        Double d2 = 3.6;
        Double d3 = 5.4;
        List<Double> doubles = new ArrayList<>();
        doubles.add(d1);
        doubles.add(d2);
        doubles.add(d3);

        var res = BinarySearch.search(doubles, 5.4);

        assertEquals(2, res);
    }

    @Test
    void search_FindElInEmptyArr() {
        List<Double> doubles = new ArrayList<>();

        var res = BinarySearch.search(doubles, 5.4);

        assertEquals(-1, res);
    }

}