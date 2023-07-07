package org.example;

import org.example.exeptions.SizeOfMaterException;

import java.util.HashSet;
import java.util.Set;


/**
 * Сlass for checking the matrix for a given condition
 */
public class MaterChecker {


    private static final Set<Character> allDigits = new HashSet<>();
    static {for (Character ch = '1'; ch <= '9'; ch++) allDigits.add(ch);}


    /**
     * checks that the matrix contains one of the digits from 1 to 9 in each row and column
     * @param matr matrix with values
     * @return true if the matrix satisfies the condition otherwise false
     */
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


    /**
     * checks that the column contains all the digits from 1 to 9 without repetitions or a dot
     * @param mater matrix with values
     * @param numOfCol number of the column to be checked
     * @return true if the column satisfies the condition otherwise false
     */
    private static boolean isValidCol(char[][] mater, int numOfCol) {
        Set<Character> setOfDigitInCol = new HashSet<>();

        for (int numOfRow = 0; numOfRow < mater.length; numOfRow++){
            var el = mater[numOfRow][numOfCol];
            if (!isValidEl(el)) return false;
            if (!setOfDigitInCol.add(el)) return false;
        }

        return setOfDigitInCol.containsAll(allDigits);
    }


    /**
     * checks that the row contains all the digits from 1 to 9 without repetitions or a dot
     * @param mater matrix with values
     * @param numOfRow number of the column to be checked
     * @return true if the row satisfies the condition otherwise false
     */
    private static boolean isValidRow(char[][] mater, int numOfRow) {
        Set<Character> setOfDigitInCol = new HashSet<>();

        for (int numOfCol = 0; numOfCol < mater[numOfRow].length; numOfCol++){
            var el = mater[numOfRow][numOfCol];
            if (!isValidEl(el)) return false;
            if (!setOfDigitInCol.add(el)) return false;
        }

        return setOfDigitInCol.containsAll(allDigits);
    }

    /**
     * checks whether a given character is a number or a dot
     * @param el the element being checked
     * @return true if the element satisfies the condition otherwise false
     */
    private static boolean isValidEl(char el) {
        return el == '.' || Character.isDigit(el);
    }

}