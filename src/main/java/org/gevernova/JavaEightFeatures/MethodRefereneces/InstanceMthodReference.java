package org.gevernova.JavaEightFeatures.MethodRefereneces;

import java.util.Arrays;
import java.util.List;
// define a class person with methdo getname.use instance method refence to obtain and print names of person
public class InstanceMthodReference {
    /**
     * Static inner class representing a Person.
     */
    static class Person {

        // Name of the person
        private String name;

        /**
         * Constructor to initialize person name.
         *
         * @param name Name of the person
         */
        Person(String name) {
            this.name = name;
        }

        /**
         * Getter method for name.
         *
         * @return person's name
         */
        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {

        // Create a list of Person objects
        List<Person> people = Arrays.asList(
                new Person("Alice"),
                new Person("Bob"),
                new Person("Charlie")
        );

        // Convert the list to a stream
        // map() extracts the name from each Person object
        // Person::getName is a method reference
        // forEach(System.out::println) prints each name
        people.stream()
                .map(Person::getName)
                .forEach(System.out::println);
    }
}
