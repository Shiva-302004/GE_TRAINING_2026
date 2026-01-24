package org.gevernova.JavaEightFeatures.DateTime;

import java.time.LocalDate;

/**
 * Demonstrates the use of TemporalAdjusters
 * in Java 8 Date and Time API.
 */
public class TemporalAdjusters {

    public static void main(String[] args) {

        // Get today's date
        java.time.LocalDate today = java.time.LocalDate.now();

        // Adjust the date to the first day of the current month
        java.time.LocalDate firstDay =
                today.with(java.time.temporal.TemporalAdjusters.firstDayOfMonth());

        // Adjust the date to the last day of the current month
        LocalDate lastDay =
                today.with(java.time.temporal.TemporalAdjusters.lastDayOfMonth());

        // Print the results
        System.out.println("First day: " + firstDay);
        System.out.println("Last day: " + lastDay);
    }
}
