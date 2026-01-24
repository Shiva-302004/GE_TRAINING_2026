package org.gevernova.JavaEightFeatures.DateTime;

import java.time.Period;
import java.util.Scanner;

/**
 * Demonstrates the use of Java 8 Date and Time API
 * to calculate the difference between two dates.
 */
public class LocalDate {

    public static void main(String[] args) {

        // Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Read the start date from the user
        System.out.println("Enter start date (yyyy-MM-dd):");
        java.time.LocalDate start = java.time.LocalDate.parse(sc.next());

        // Read the end date from the user
        System.out.println("Enter end date (yyyy-MM-dd):");
        java.time.LocalDate end = java.time.LocalDate.parse(sc.next());

        // Calculate the period (difference) between start and end dates
        Period period = Period.between(start, end);

        // Display the difference in years, months, and days
        System.out.println("Difference: "
                + period.getYears() + " years, "
                + period.getMonths() + " months, "
                + period.getDays() + " days");
    }
}
