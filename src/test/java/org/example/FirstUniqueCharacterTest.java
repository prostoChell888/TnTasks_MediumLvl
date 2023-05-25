package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import  org.example.FirstUniqueCharacter;
import static org.junit.jupiter.api.Assertions.*;

class FirstUniqueCharacterTest {

    private static final String END_OF_STR = "\0";

    @ParameterizedTest
    @CsvSource({
            "aabbcde, c",
            "abcabc, '" + END_OF_STR + "'",
            "abcdefg, a",
            "aabbccdd, '" + END_OF_STR + "'",
            "hello, h"
    })
    public void find_StrWithUniqueEl_FirstUniqueElOrEndOfStr(String input, char expected) {

        char actual = FirstUniqueCharacter.find(input);

        assertEquals(expected, actual);
    }

    @Test
    public void find_EmptyStr_FirstUniqueEl_EndOfStr() {
        String emptyStr = "";

        char result = FirstUniqueCharacter.find(emptyStr);

        Assertions.assertEquals(END_OF_STR, result);
    }
}