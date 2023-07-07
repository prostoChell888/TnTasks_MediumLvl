package org.example;


import java.util.HashMap;
import java.util.Map;

/**
 * This class containing a method that finds the first unique character in a string
 */

public class FirstUniqueCharacter {


    private static final char NOT_FOUND = '\0';

    /**
     * @param str string
     * @return the first unique character, if there is one, else '\0'
     */
    public static char find(String str) {
        Map<Character, Integer> countsOfChar = new HashMap<>();
        char[] charArray = str.toCharArray();

        for (char ch : charArray) {
            countsOfChar.put(ch, countsOfChar.getOrDefault(ch, 0) + 1);
        }

        for (char ch : charArray) {
            if (countsOfChar.get(ch) == 1) {
                return ch;
            }
        }

        return NOT_FOUND;
    }
}