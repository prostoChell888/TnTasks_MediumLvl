package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, -2, 3, -4, 5, -6);
        Map<String, Integer> sumMap = SumOfPositiveAndNegativeNums.sum(numbers);

        int sumOfPositive = sumMap.get("positive");
        int sumOfNegative = sumMap.get("negative");

        System.out.println("Sum of positive numbers: " + sumOfPositive);
        System.out.println("Sum of negative numbers: " + sumOfNegative);
    }
}
