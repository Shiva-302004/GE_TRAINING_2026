package org.gevernova.JavaEightFeatures.MethodRefereneces;

/**
 * Demonstrates the use of Constructor Method Reference
 * in Java 8.
 * create function interface ShapeCreator with method create
 * returns a new shape rectangle
 * implement interface using a constructor
 * method reference for rectangle class
 */
public class ConstructorMethodRefernce {

    /**
     * Functional interface whose abstract method
     * matches the Rectangle constructor signature.
     */
    interface ShapeCreator {

        /**
         * Creates and returns a Rectangle object.
         *
         * @param len  Length of the rectangle
         * @param wid  Width of the rectangle
         * @return newly created Rectangle
         */
        Rectangle create(int len, int wid);
    }

    /**
     * Rectangle class with length and width.
     */
    static class Rectangle {

        int length;
        int width;

        /**
         * Parameterized constructor for Rectangle.
         *
         * @param length Length of the rectangle
         * @param width  Width of the rectangle
         */
        Rectangle(int length, int width) {
            this.length = length;
            this.width = width;
        }

        /**
         * Overrides toString() to display rectangle details.
         *
         * @return String representation of Rectangle
         */
        @Override
        public String toString() {
            return "Rectangle [length=" + length + ", width=" + width + "]";
        }
    }

    public static void main(String[] args) {

        // Constructor method reference
        // Rectangle::new refers to the Rectangle(int, int) constructor
        ShapeCreator sp = Rectangle::new;

        // Create a Rectangle object using the method reference
        Rectangle r = sp.create(10, 20);

        // Print the created Rectangle object
        System.out.println(r);
    }
}
