package org.example;

import java.util.Arrays;
import java.util.Objects;

public class AnagramChecker {

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