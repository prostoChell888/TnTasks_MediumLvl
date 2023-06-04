package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final int MIN_AGE = 14;

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            persons.add(PersonCreator.createPerson(10));
        }

        var peopleWithAgeMoreThanMinAge = PersonFilter.filterByMinAge(persons, MIN_AGE);
        peopleWithAgeMoreThanMinAge.forEach(person -> System.out.println(person.getAddress()));

    }
}