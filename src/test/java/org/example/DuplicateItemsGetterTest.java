package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateItemsGetterTest {



    @ParameterizedTest
    @MethodSource("testCases")
    <T> void getDuplicatesGivenListReturnListWithDuplicates(List<T> input, List<T> expectedOutput) {
        List<T> actualOutput = DuplicateItemsGetter.getDuplicates(input);
        assertEquals(expectedOutput, actualOutput);
    }


    private static List<Object[]> testCases() {
        return Arrays.asList(
                new Object[]{List.of(1, 2, 3, 2, 3, 4, 4), List.of(2, 3, 4)},
                new Object[]{List.of("apple", "banana", "apple", "cherry"), List.of("apple")},
                new Object[]{List.of(1, 2, 3, 4, 5), new ArrayList<>()},
                new Object[]{List.of("a", "b", "c", "b", "c", "d"), List.of("b", "c")}
        );
    }


    @Test
    <T> void getDuplicatesGivenEmptyListReturnEmptyList() {
        List<T> input = new ArrayList<>();
        List<T> expectedOutput = new ArrayList<>();
        List<T> actualOutput = DuplicateItemsGetter.getDuplicates(input);
        assertEquals(expectedOutput, actualOutput);
    }
}