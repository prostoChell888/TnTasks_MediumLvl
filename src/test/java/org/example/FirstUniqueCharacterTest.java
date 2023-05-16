package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import  org.example.FirstUniqueCharacter;
import static org.junit.jupiter.api.Assertions.*;

class FirstUniqueCharacterTest {

    @Test
    void find_StrWithUniqueEl_FirstUniqueEl() {

    }

    @ParameterizedTest
    @CsvSource({
            "aabbcde, c",
            "abcabc, '\0'",
            "abcdefg, a",
            "aabbccdd, '\0'",
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

        assertEquals('\0', result);
    }
}