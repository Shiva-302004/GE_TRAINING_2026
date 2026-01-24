package org.gevernova.JavaEightFeatures.MethodRefereneces;

import java.util.Optional;
import java.util.Scanner;

/**
 * Demonstrates the use of method references
 * with Optional in Java 8.
 */
public class MethodReferenceInOptional {

    public static void main(String[] args) {

        // Scanner object to read input from console
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter string: ");
        String input = sc.nextLine();

        // Wrap input inside Optional to handle null safely
        // map(String::toUpperCase) converts the string to uppercase
        // ifPresent(System.out::println) prints the value if present
        Optional.ofNullable(input)
                .map(String::toUpperCase)
                .ifPresent(System.out::println);
    }
}
