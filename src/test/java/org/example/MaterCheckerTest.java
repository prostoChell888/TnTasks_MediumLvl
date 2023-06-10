package org.example;

import org.example.exeptions.SizeOfMaterException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaterCheckerTest {

     @Test
     void testValidMatrix() {
         char[][] matrix = {
                 {'5', '3', '4', '6', '7', '8', '9', '1', '2'},
                 {'6', '7', '2', '1', '9', '5', '3', '4', '8'},
                 {'1', '9', '8', '3', '4', '2', '5', '6', '7'},
                 {'8', '5', '9', '7', '6', '1', '4', '2', '3'},
                 {'4', '2', '6', '8', '5', '3', '7', '9', '1'},
                 {'7', '1', '3', '9', '2', '4', '8', '5', '6'},
                 {'9', '6', '1', '5', '3', '7', '2', '8', '4'},
                 {'2', '8', '7', '4', '1', '9', '6', '3', '5'},
                 {'3', '4', '5', '2', '8', '6', '1', '7', '9'}
         };

         Assertions.assertTrue(MaterChecker.isValidMater(matrix));
     }

    @Test
     void testNotValidMatrix() {
        char[][] matrix = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        Assertions.assertFalse(MaterChecker.isValidMater(matrix));
    }

    @Test
     void testInvalidMatrixDuplicateDigitInRow() {
        char[][] matrix = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '6', '.', '2', '8', '.'}, // Дублирующаяся цифра 6 в строке
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        Assertions.assertFalse(MaterChecker.isValidMater(matrix));
    }

    @Test
    void testInvalidMatrixDuplicateDigitInColumn() {
        char[][] matrix = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '5'} // Дублирующаяся цифра 5 в столбце
        };

        Assertions.assertFalse(MaterChecker.isValidMater(matrix));
    }

    @Test
    void testInvalidMatrixInvalidCharacter() {
        char[][] matrix = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', 'A'} // Недопустимый символ 'A'
        };

        Assertions.assertFalse(MaterChecker.isValidMater(matrix));
    }

    @Test
    void testInvalidMatrixInconsistentRowLengths() {
        char[][] matrix = {
                {'1', '2', '3', '4', '5', '6', '7', '8', '9', '.'},
                {'.', '.', '.', '.', '8', '.'} ,// Неправильная длина строки
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'}

        };

        Assertions.assertThrows(SizeOfMaterException.class, () -> MaterChecker.isValidMater(matrix));
    }

    @Test
    void testInvalidMatrixEmptyMatrix() {
        char[][] matrix = {};

        Assertions.assertThrows(SizeOfMaterException.class, () -> MaterChecker.isValidMater(matrix));
    }
}