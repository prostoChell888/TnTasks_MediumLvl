package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SumOfPositiveAndNegativeNumTest {

    @ParameterizedTest
    @MethodSource("testData")
    void shouldCalculateCorrectSum(List<Integer> input, Map<String, Integer> expected) {

        Map<String, Integer> result = SumOfPositiveAndNegativeNums.sum(input);

        assertEquals(expected, result);
    }

    private static Stream<Object[]> testData() {
        return Stream.of(

                new Object[]{Arrays.asList(1, 2, -3, 4, -5), createExpectedResult(7, -8)},
                new Object[]{Arrays.asList(-10, -20, -30), createExpectedResult(0, -60)},
                new Object[]{Arrays.asList(1, 2, 3, 4, 5), createExpectedResult(15, 0)},

                new Object[]{Arrays.asList(1, 2, 3, 4, 5), createExpectedResult(15, 0)},
                new Object[]{Arrays.asList(10, 20, 30), createExpectedResult(60, 0)},

                new Object[]{Arrays.asList(-1, -2, -3, -4, -5), createExpectedResult(0, -15)},
                new Object[]{Arrays.asList(-10, -20, -30), createExpectedResult(0, -60)},

                new Object[]{List.of(), createExpectedResult(0, 0)},

                new Object[]{Arrays.asList(1, null, -3, 4, null), createExpectedResult(5, -3)}
        );
    }


    private static Map<String, Integer> createExpectedResult(int positiveSum, int negativeSum) {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("positive", positiveSum);
        expected.put("negative", negativeSum);
        return expected;
    }
}