package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumOfPositiveAndNegativeNums {

    /**
     *  find sum of positive and negative integer nums
     * @param list with nonzero integers
     * @return Map with sum of positive numbers by key "positive"
     *              sum of negative numbers by key "negative"
     */
    public static Map<String, Integer> sum(List<Integer> list) {
        Map<String, Integer> coordinates = new HashMap<>();

        var sumOfPositive = list.stream().filter(x -> x != null && x > 0).mapToInt(x -> x).sum();
        var sumOfNegative = list.stream().filter(x -> x != null && x < 0).mapToInt(x -> x).sum();

        coordinates.put("positive", sumOfPositive);
        coordinates.put("negative", sumOfNegative);

        return coordinates;
    }
}