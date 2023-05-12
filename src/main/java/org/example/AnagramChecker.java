package org.example;

import java.util.Arrays;
import java.util.Objects;

public class AnagramChecker {

    public static boolean check(String firstWord, String secondWord) {
        if (firstWord == null || secondWord == null) return false;

        firstWord = firstWord.toLowerCase();
        secondWord = secondWord.toLowerCase();

        if (Objects.equals(firstWord, secondWord)) return false;

        var charArrOfFirstWord = firstWord.toCharArray();
        var charArrOfFSecondWord = secondWord.toCharArray();

        Arrays.sort(charArrOfFirstWord);
        Arrays.sort(charArrOfFSecondWord);

        return Arrays.equals(charArrOfFirstWord, charArrOfFSecondWord);
    }
}