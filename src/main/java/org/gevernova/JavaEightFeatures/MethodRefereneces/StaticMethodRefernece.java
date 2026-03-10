package org.gevernova.JavaEightFeatures.MethodRefereneces;

import java.util.Arrays;
import java.util.List;

public class StaticMethodRefernece {
    // Static method that prints the square of a given number
    public static void printSquare(int n) {
        System.out.println(n * n);
    }
    // create a program that uses static method refernces to
    // print the squares of each element in the list of integers
    public static void main(String[] args) {

        // Create a list of integers
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // forEach() iterates over each element in the list
        // Main::printSquare is a method reference
        // It refers to the static method printSquare(int)
        // Each element of the list is passed as an argument to printSquare
        list.forEach(StaticMethodRefernece::printSquare);
    }
}
