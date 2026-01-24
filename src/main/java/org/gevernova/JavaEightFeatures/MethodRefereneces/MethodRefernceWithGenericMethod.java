package org.gevernova.JavaEightFeatures.MethodRefereneces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Demonstrates the use of method references
 * with a generic method in Java 8.
 * create a program that uses generic method to find and print the max element in
 * the list
 */
public class MethodRefernceWithGenericMethod {

    /**
     * Generic method to find the maximum element in a list.
     * The type parameter T must implement Comparable.
     *
     * @param list List of elements
     * @param <T>  Type of elements that are comparable
     * @return Maximum element from the list
     */
    public static <T extends Comparable<T>> T max(List<T> list) {

        // Collections.max() finds the maximum element
        // Comparable::compareTo is a method reference
        // to the compareTo method of Comparable interface
        return Collections.max(list, Comparable::compareTo);
    }

    public static void main(String[] args) {

        // Create a list of integers
        List<Integer> ll = new ArrayList<>(List.of(1, 34, 234, 5, 345, 678));

        // Find and print the maximum value from the list
        System.out.println(max(ll));
    }
}
