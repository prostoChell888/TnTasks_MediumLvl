package org.example;

import java.util.List;

/**
 * @author prostoChell888
 * @version 1.0
 * This class provides a method for sorting an array
 */
public class BinarySearch {











    /**
     * This method implements binary search in a sorted array
     * @param list sorted array
     * @param target the element whose position you need to find
     *               or -1 if there is no such element
     * @return the position of the desired element
     * @param <T> a class that implements the Comparable interface
     */
    public static <T extends Comparable<T>> int search(List<T> list, T target) {
        int leftOrder = 0;
        int rightOrder = list.size() - 1;

        while (leftOrder <= rightOrder) {
            int mid = (leftOrder + rightOrder) >> 1;
            int resOfComparison = target.compareTo(list.get(mid));
            if (isThisElEqualsSerching(resOfComparison)) {
                return mid;
            }
            else if (isThisElBiggerThenSerching(resOfComparison)) {
                leftOrder = mid + 1;
            }
            else {
                rightOrder = mid - 1;
            }
        }

        return -1;
    }

    private static boolean isThisElBiggerThenSerching(int resOfComparison) {
        return resOfComparison > 0;
    }

    private static boolean isThisElEqualsSerching(int resOfComparison) {
        return resOfComparison == 0;
    }
}