package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        int target1 = 3;
        int result1 = BinarySearch.search(list1, target1);
        System.out.println("Target " + target1 + " found at index " + result1);

        List<String> list2 = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "kiwi"));
        String target2 = "banana";
        int result2 = BinarySearch.search(list2, target2);
        System.out.println("Target " + target2 + " found at index " + result2);

        List<Double> list3 = Arrays.asList(1.2, 2.4, 3.6, 4.8, 6.0, 7.2, 8.4);
        double target3 = 6.0;
        int result3 = BinarySearch.search(list3, target3);
        System.out.println("Target " + target3 + " found at index " + result3);
    }
}
