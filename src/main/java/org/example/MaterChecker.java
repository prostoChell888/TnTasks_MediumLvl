package org.example;

import org.example.exeptions.SizeOfMaterException;

import java.util.HashSet;
import java.util.Set;


/**
 * Сlass for checking the matrix for a given condition
 */
public class MaterChecker {
    private static final char DOT_CHAR = '.';

    /**
     * checks that the matrix contains one of the digits from 1 to 9 in each row and column
     *
     * @param matr matrix with values
     * @return true if the matrix satisfies the condition otherwise false
     */
    public static boolean isValidMater(char[][] matr) {
        if (matr.length == 0) throw new SizeOfMaterException("Матрица пуста");
        var countOfElInRaw = matr[0].length;
        if (isAllElValid(matr)) return false;

        for (int numOfRow = 0; numOfRow < matr.length; numOfRow++) {
            if (countOfElInRaw != matr[numOfRow].length) throw new SizeOfMaterException("Строки матрицы разной длинны");
            if (!isValidRow(matr, numOfRow)) return false;
        }
        for (int numOfCol = 0; numOfCol < matr[0].length; numOfCol++) {
            if (!isValidCol(matr, numOfCol)) return false;
        }

        return isValidSquares(matr);
    }


    /**
     * checks that all 3 by 3 square contains only unique numbers from 1 to 9 and dots
     *
     * @param matr the matrix in which this is checked
     * @return true if matrix valid else false
     */
    private static boolean isValidSquares(char[][] matr) {
        for (int i = 0; i < matr.length; i += 3) {
            for (int j = 0; j < matr[0].length; j += 3) {
                if (!isValidSquare(i, j, matr)) return false;
            }
        }

        return true;
    }

    /**
     * checks that all elements are valid
     *
     * @param matr matrix
     * @return true if valid else false
     */
    private static boolean isAllElValid(char[][] matr) {
        for (var str : matr) {
            for (var el : str) {
                if (!isValidEl(el)) return true;
            }
        }

        return false;
    }

    /**
     * checks that a 3 by 3 square contains only unique numbers from 1 to 9 and dots
     *
     * @param startColIndex start column index
     * @param startRowIndex start row index
     * @param matr the matrix in which this is checked
     * @return true if matrix valid else false
     */
    private static boolean isValidSquare(int startColIndex, int startRowIndex, char[][] matr) {
        Set<Character> setOfDigitInSquare = new HashSet<>();
        for (int i = startColIndex; i < startColIndex + 3; i++) {
            for (int j = startRowIndex; j < startRowIndex + 3; j++) {
                if (matr[i][j] == DOT_CHAR) continue;
                if (!setOfDigitInSquare.add(matr[i][j])) return false;
            }
        }

        return true;
    }


    /**
     * checks that the column contains all the digits from 1 to 9 without repetitions or a dot
     *
     * @param mater    matrix with values
     * @param numOfCol number of the column to be checked
     * @return true if the column satisfies the condition otherwise false
     */
    private static boolean isValidCol(char[][] mater, int numOfCol) {
        Set<Character> setOfDigitInCol = new HashSet<>();

        for (char[] chars : mater) {
            if (chars[numOfCol] == DOT_CHAR) continue;
            if (!setOfDigitInCol.add(chars[numOfCol])) return false;
        }

        return true;
    }


    /**
     * checks that the row contains all the digits from 1 to 9 without repetitions or a dot
     *
     * @param mater    matrix with values
     * @param numOfRow number of the column to be checked
     * @return true if the row satisfies the condition otherwise false
     */
    private static boolean isValidRow(char[][] mater, int numOfRow) {
        Set<Character> setOfDigitInCol = new HashSet<>();

        for (int numOfCol = 0; numOfCol < mater[numOfRow].length; numOfCol++) {
            if (mater[numOfRow][numOfCol] == DOT_CHAR) continue;
            if (!setOfDigitInCol.add(mater[numOfRow][numOfCol])) return false;
        }

        return true;
    }

    /**
     * checks whether a given character is a number or a dot
     *
     * @param el the element being checked
     * @return true if the element satisfies the condition otherwise false
     */
    private static boolean isValidEl(char el) {
        return el == DOT_CHAR || Character.isDigit(el);
    }
}