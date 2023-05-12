package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class AnagramCheckerTest {

    @ParameterizedTest
    @CsvSource(value = {
            "listen,silent",
            "rail safety,fairy tales",
            "silent*,*listen",
            "1234,4321"
    }
    )
    void check_StringsAreAnagrams_True(String firstStr, String secondStr) {

        var res = AnagramChecker.check(firstStr, secondStr);

        assertTrue(res);
    }


    @ParameterizedTest
    @CsvSource(value = {
            "listen,silent1",
            "rail safety,fairy taless",
            "silent*,*lis",
            "12345,4321",
            ",word",
            "word,",
            ","
    }
    )
    void check_StringsAreNotAnagrams_False(String firstStr, String secondStr) {

        var res = AnagramChecker.check(firstStr, secondStr);

        assertFalse(res);
    }

    @Test
    void check_BlankStringsAreNotAnagrams_False() {
        String firstStr = "";
        String secondStr ="";

        var res = AnagramChecker.check(firstStr, secondStr);

        assertFalse(res);
    }
}