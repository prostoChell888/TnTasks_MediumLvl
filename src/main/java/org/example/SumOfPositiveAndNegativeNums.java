package org.example;

import java.util.*;

public class SumOfPositiveAndNegativeNums {

    private static final String POSITIVE = "positive";
    private static final String NEGATIVE = "negative";

    /**
     * find sum of positive and negative integer nums
     *
     * @param list with nonzero integers
     * @return Map with sum of positive numbers by key "positive"
     * sum of negative numbers by key "negative"
     */
    public static Map<String, Integer> sum(List<Integer> list) {
        return list.stream()
                .map(number -> Map.of(determineSignOfNum(number), number))
                .reduce(new HashMap<>(Map.of(POSITIVE, 0, NEGATIVE, 0)),
                        (accumMap, map) -> {
                            Integer number = Optional.ofNullable(map.get(POSITIVE)).orElse(map.get(NEGATIVE));
                            accumMap.merge(determineSignOfNum(number), map.get(determineSignOfNum(number)), Integer::sum);
                            return accumMap;
                        }
                );
    }

    private static String determineSignOfNum(Integer number) {
        return (number > 0) ? POSITIVE : NEGATIVE;
    }
}