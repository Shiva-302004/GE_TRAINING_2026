package org.gevernova.JavaEightFeatures.MethodRefereneces;

import java.util.Arrays;
import java.util.List;

// create a program that sorts a list of strings using an instance method refernece to the comparetoignorecase method of string
public class ArbitaryInstance {
    public static void main(String[] args) {

        // Create a list of names
        List<String> names = Arrays.asList("shiva", "jay", "aryan");

        // Sort the list in case-insensitive alphabetical order
        // String::compareToIgnoreCase is a method reference
        names.sort(String::compareToIgnoreCase);

        // Print each name using method reference
        names.forEach(System.out::println);
    }
}
