package org.gevernova.JavaEightFeatures.MethodRefereneces;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates the use of method reference
 * with Stream map() operation in Java 8.
 * program that reads a list and converts then into
 * uppercase and print result with method reference
 */
public class MethodRefenceWithStream {

    /**
     * Converts a string to uppercase.
     *
     * @param one Input string
     * @return Uppercase version of the string
     */
    public static String convertToupperCase(String one) {
        return one.toUpperCase();
    }

    public static void main(String[] args) {

        // Create a list of lowercase strings
        List<String> ll = new ArrayList<>(List.of("shiva", "komal", "jay", "arayan"));

        // Convert list to stream
        // map() transforms each element using method reference
        // MethodRefenceWithStream::convertToupperCase
        // forEach() prints each transformed element
        ll.stream()
                .map(MethodRefenceWithStream::convertToupperCase)
                .forEach(System.out::println);
    }
}
