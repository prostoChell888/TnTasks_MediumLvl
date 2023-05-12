package org.example;

import java.util.ArrayList;
import java.util.Collections;
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

            int resOfComp = target.compareTo(list.get(mid));

            if (resOfComp == 0) return mid;
            else if (resOfComp > 0) leftOrder = mid + 1;
            else rightOrder = mid - 1;
        }

        return -1;
    }
}