package org.gevernova.JavaEightFeatures.DateTime;

import java.time.LocalDate;

/**
 * Demonstrates date formatting using
 * Java 8 DateTimeFormatter.
 */
public class DateTimeFormatter {

    public static void main(String[] args) {

        // Input date string in ISO format (yyyy-MM-dd)
        String input = "2026-01-14";

        // Parse the string into a LocalDate object
        LocalDate date = LocalDate.parse(input);

        // Create a DateTimeFormatter with custom pattern
        // dd -> day
        // MM -> month
        // yyyy -> year
        java.time.format.DateTimeFormatter formatter =
                java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Format the LocalDate using the specified pattern
        System.out.println(date.format(formatter));
    }
}
