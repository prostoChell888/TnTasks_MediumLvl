package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {

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


    public static void main(String[] args) {

        List<Integer> list = List.of(10, 20, 30);

        System.out.println(search(list, 20));
    }
}