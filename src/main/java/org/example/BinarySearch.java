package org.example;

import java.util.List;

/**
 * @author prostoChell888
 * @version 1.0
 * This class provides a method for sorting an array
 */
public class BinarySearch {

    private static final int SIFT_OF_POS = 1;
    private static final int START_POS = 0;

    private static final int NOT_FOUND = -1;

    private static final int EL_ARE_EQUALS = 0;

    private static final int SHIFT_NEED_TO_TWO_DIVISION = 1;


    /**
     * This method implements binary search in a sorted array
     * @param list sorted array
     * @param target the element whose position you need to find
     *               or -1 if there is no such element
     * @return the position of the desired element
     * @param <T> a class that implements the Comparable interface
     */
    public static <T extends Comparable<T>> int search(List<T> list, T target) {
        int leftOrder = START_POS;
        int rightOrder = list.size() - SIFT_OF_POS;

        while (leftOrder <= rightOrder) {
            int mid = (leftOrder + rightOrder) >> SHIFT_NEED_TO_TWO_DIVISION;
            int resOfComparison = target.compareTo(list.get(mid));
            if (resOfComparison == EL_ARE_EQUALS) {
                return mid;
            }
            else if (resOfComparison > 0) {
                leftOrder = mid + SIFT_OF_POS;
            }
            else {
                rightOrder = mid - SIFT_OF_POS;
            }
        }

        return NOT_FOUND;
    }
}