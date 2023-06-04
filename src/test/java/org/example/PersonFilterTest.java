package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PersonFilterTest {

    @ParameterizedTest
    @MethodSource("testData")
    void filterByMinAge_shouldReturnCorrectList(List<Person> input, int minAge, List<Person> expected) {
        List<Person> result = PersonFilter.filterByMinAge(input, minAge);
        assertEquals(expected, result);
    }

    private static Stream<Object[]> testData() {


        Person person = new Person(12, "");
        Person person2 = new Person(14, "");
        Person person1 = new Person(13, "");
        return Stream.of(
                new Object[]{new ArrayList<>(), 15, new ArrayList<>()},
                new Object[]{Arrays.asList(null, null, null), 15, new ArrayList<>()},
                new Object[]{
                        Arrays.asList(
                                person,
                                person2,
                                person1
                        ),
                        15,
                        new ArrayList<>()

                },
                new Object[]{
                        Arrays.asList(
                                person,
                                person2,
                                person1
                        ),
                        13,
                        List.of(
                                person2,
                                person1
                        )
                },
                new Object[]{
                        Arrays.asList(
                                person,
                                null,
                                person2,
                                person1


                        ),
                        15,
                        List.of(
                        )
                }
        );
    }
}