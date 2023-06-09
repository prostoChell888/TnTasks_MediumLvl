package org.example;

import java.util.HashSet;
import java.util.Set;

public class MaterChecker {
    private static final char DOT_CHAR = '.';
    private static final char ONE_CHAR = '1';
    private static final char NINE_CHAR = '9';
    private static final Set<Character> allDigits = new HashSet<>();
    static {for (Character ch = ONE_CHAR; ch <= NINE_CHAR; ch++) allDigits.add(ch);}


    public static boolean isValidMater(char[][] matr) {

        if (matr.length == 0) throw new SizeOfMaterException("Матрица пуста");
        var countOfElInRaw = matr[0].length;

        for (int numOfRow = 0; numOfRow < matr.length; numOfRow++) {
            if (countOfElInRaw != matr[numOfRow].length) throw new SizeOfMaterException("Строки матрицы разной длинны");
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
            if (!setOfDigitInCol.add(el)) return false;
        }

        return setOfDigitInCol.containsAll(allDigits);
    }

    private static boolean isValidRow(char[][] mater, int numOfRow) {
        Set<Character> setOfDigitInCol = new HashSet<>();

        for (int numOfCol = 0; numOfCol < mater[numOfRow].length; numOfCol++){
            var el = mater[numOfRow][numOfCol];
            if (!isValidEl(el)) return false;
            if (!setOfDigitInCol.add(el)) return false;
        }

        return setOfDigitInCol.containsAll(allDigits);
    }

    private static boolean isValidEl(char el) {
        return el == DOT_CHAR || Character.isDigit(el);
    }

}