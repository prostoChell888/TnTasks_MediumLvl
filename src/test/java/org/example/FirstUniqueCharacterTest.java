package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstUniqueCharacterTest {

    private static final char END_OF_STR = '\0';

    @ParameterizedTest
    @CsvSource({
            "aabbcde, c",
            "abcabc, '" + END_OF_STR + "'",
            "abcdefg, a",
            "aabbccdd, '" + END_OF_STR + "'",
            "hello, h"
    })
    void findGivenStrWithUniqueElReturnFirstUniqueElOrEndOfStr(String input, char expected) {

        char actual = FirstUniqueCharacter.find(input);

        assertEquals(expected, actual);
    }

    @Test
    void findGivenEmptyStrReturnEndOfStr() {
        String emptyStr = "";

        char result = FirstUniqueCharacter.find(emptyStr);

        Assertions.assertEquals(END_OF_STR, result);
    }
}