package org.gevernova.JavaEightFeatures.MethodRefereneces;

/**
 * Demonstrates the use of method references
 * with a custom functional interface.
 */
public class MethodRefeneceInFunctionalInterface {

    /**
     * Functional interface representing a calculator operation.
     * Any method matching this signature can be referenced.
     */
    interface Calculator {

        /**
         * Performs a calculation on two integers.
         *
         * @param a First operand
         * @param b Second operand
         * @return Result of the calculation
         */
        int calculate(int a, int b);
    }

    /**
     * Adds two numbers.
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts second number from first.
     */
    public static int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two numbers.
     */
    public static int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides first number by second.
     */
    public static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {

        // Method references to static methods
        Calculator add = MethodRefeneceInFunctionalInterface::add;
        Calculator sub = MethodRefeneceInFunctionalInterface::subtract;
        Calculator mul = MethodRefeneceInFunctionalInterface::multiply;
        Calculator div = MethodRefeneceInFunctionalInterface::divide;

        // Execute calculations using functional interface references
        System.out.println(add.calculate(10, 5));
        System.out.println(sub.calculate(10, 5));
        System.out.println(mul.calculate(10, 5));
        System.out.println(div.calculate(10, 5));
    }
}
