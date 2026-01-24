package org.gevernova.JavaEightFeatures.MethodRefereneces;

import java.util.List;
import java.util.Random;

/**
 * Demonstrates the use of constructor method reference
 * with Java Streams.
 * program that generates a stream of random integres
 * and collects them into the list of Person as age
 */
public class ConstructorReferenceWithStream {

    /**
     * Static inner class representing a Person.
     */
    static class Person {

        // Age of the person
        int age;

        /**
         * Constructor to initialize age.
         *
         * @param age Age of the person
         */
        Person(int age) {
            this.age = age;
        }

        /**
         * Overrides toString() to display age details.
         *
         * @return String representation of Person
         */
        @Override
        public String toString() {
            return "Age: " + age;
        }
    }

    public static void main(String[] args) {

        // Generate a stream of random integers
        // ints(20, 25, 30) generates 20 random numbers between 25 (inclusive) and 30 (exclusive)
        // mapToObj(Person::new) uses constructor method reference
        // to convert each integer into a Person object
        List<Person> people = new Random()
                .ints(20, 25, 30)
                .mapToObj(Person::new)
                .toList();

        // Print all generated Person objects
        people.forEach(System.out::println);
    }
}
