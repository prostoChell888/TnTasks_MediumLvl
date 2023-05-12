package org.example;

import java.util.Arrays;
import java.util.Objects;


/**
 * @author prostoChell888
 * @version 1.0
 * This class provides a method for check anagrams
 */
public class AnagramChecker {

    /**
     * This function checks whether these strings are anagrams
     * @param firstStr first string
     * @param secondStr second string
     * @return true if strings are anagram else false
     */
    public static boolean check(String firstStr, String secondStr) {
        if (firstStr == null || secondStr == null) return false;

        firstStr = firstStr.toLowerCase();
        secondStr = secondStr.toLowerCase();

        if (Objects.equals(firstStr, secondStr)) return false;

        var charArrOfFirstStr = firstStr.toCharArray();
        var charArrOfFSecondStr = secondStr.toCharArray();

        Arrays.sort(charArrOfFirstStr);
        Arrays.sort(charArrOfFSecondStr);

        return Arrays.equals(charArrOfFirstStr, charArrOfFSecondStr);
    }
}