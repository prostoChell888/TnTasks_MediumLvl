package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 2, 4, 5, 4, 6, 7, 8, 7);
        List<Integer> duplicates = DuplicateItemsGetter.getDuplicates(numbers);
        System.out.println("List of duplicate items: " + duplicates);
    }
}
