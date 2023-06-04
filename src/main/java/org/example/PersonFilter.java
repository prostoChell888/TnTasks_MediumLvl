package org.example;

import java.util.List;

public class PersonFilter {
    /**
     * Finds people whose age is less than the specified one
     * @param personList list of Person
     * @param minAge min age of Person
     * @return list of Person whose age is less minAge
     */
    public static List<Person> filterByMinAge(List<Person> personList, int minAge) {
        return personList.stream().filter(person -> person != null && person.getAge() >= minAge).toList();
    }

}
