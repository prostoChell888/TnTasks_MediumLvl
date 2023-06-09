package org.example;

import java.util.HashSet;
import java.util.Set;

public class MaterChecker {
    private static final char DOT_CHAR = '.';
    private static final char ZERO_CHAR = '0';
    private static final char NINE_CHAR = '9';
    private static final Set<Character> allDigits = new HashSet<>();
    static {for (Character ch = ZERO_CHAR; ch <= NINE_CHAR; ch++) allDigits.add(ch);}


    public static boolean isValidMater(char[][] matr) {
        var countOfElInCol = matr[0].length;
        if (countOfElInCol == 0) throw new SizeOfMaterException("Матрица пуста");

        for (int numOfRow = 0; numOfRow < matr.length; numOfRow++) {
            if (countOfElInCol != matr[numOfRow].length) throw new SizeOfMaterException("Строки матрицы разной длинны");
            if (!isValidRow(matr, numOfRow)) return false;
        }

        for (int numOfCol = 0; numOfCol < matr[0].length; numOfCol++) {
            if (!isValidCol(matr, numOfCol)) return false;
        }

        return true;
    }

    private static boolean isValidCol(char[][] mater, int numOfCol) {
        Set<Character> setOfDigitInCol = new HashSet<>();

        for (int numOfRow = 0; numOfRow < mater.length; numOfRow++){
            var el = mater[numOfRow][numOfCol];
            if (!isValidEl(el)) return false;
            if (setOfDigitInCol.add(el)) return false;
        }

        return setOfDigitInCol.containsAll(allDigits);
    }

    private static boolean isValidRow(char[][] mater, int numOfRow) {
        Set<Character> setOfDigitInCol = new HashSet<>();

        for (int numOfCol = 0; numOfCol < mater[numOfRow].length; numOfCol++){
            var el = mater[numOfRow][numOfCol];
            if (!isValidEl(el)) return false;
            if (setOfDigitInCol.add(el)) return false;
        }

        return setOfDigitInCol.containsAll(allDigits);
    }

    private static boolean isValidEl(char el) {
        return el == DOT_CHAR || Character.isDigit(el);
    }

}