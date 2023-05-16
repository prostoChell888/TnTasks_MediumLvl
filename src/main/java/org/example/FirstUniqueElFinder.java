package org.example;


/**
 * This class containing a method that finds the first unique character in a string
 */
public class FirstUniqueElFinder {


    /**
     * @param str string
     * @return the first unique character, if there is one, else '\0'
     */
    public static char find(String str) {
        var arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j ) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) return arr[i];
        }

        return '\0';
    }


    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}