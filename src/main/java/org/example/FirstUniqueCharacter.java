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
        Map<Character, Integer> charCounts = new HashMap<>();
        char[] charArray = str.toCharArray();

        for (char ch : charArray) {
            charCounts.put(ch, charCounts.getOrDefault(ch, 0) + 1);
        }

        for (char ch : charArray) {
            if (charCounts.get(ch) == 1) {
                return ch;
            }
        }

        return NOT_FOUND;
    }
}