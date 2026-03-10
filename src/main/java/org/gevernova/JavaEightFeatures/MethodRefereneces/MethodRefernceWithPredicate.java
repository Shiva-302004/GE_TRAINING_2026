package org.gevernova.JavaEightFeatures.MethodRefereneces;

import java.util.Arrays;
import java.util.List;

/**
 * Demonstrates the use of method reference
 * with a Predicate-like method in Java 8.
 * program that uses method refence to filter
 * a list of strings based on whether they contains a or not
 */
public class MethodRefernceWithPredicate {

    /**
     * Checks whether the given string contains the letter 'a'.
     *
     * @param s Input string
     * @return true if the string contains 'a', otherwise false
     */
    public static boolean containsA(String s) {
        return s.contains("a");
    }

    public static void main(String[] args) {

        // Create a list of words
        List<String> words = Arrays.asList("shiva", "jay", "tom", "billu");

        // Convert the list to a stream
        // filter() uses a method reference as a Predicate
        // MethodRefernceWithPredicate::containsA
        // forEach() prints the filtered words
        words.stream()
                .filter(MethodRefernceWithPredicate::containsA)
                .forEach(System.out::println);
    }
}
