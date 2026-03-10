package org.gevernova.JavaEightFeatures.DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Demonstrates parsing and formatting of date-time
 * using custom patterns in Java 8 Date-Time API.
 */
public class CustomDateFormat {

    public static void main(String[] args) {

        // Input date-time string in custom format
        String input = "15-Jan-2022 14:30:00";

        // Formatter to match the input pattern
        // dd  -> day
        // MMM -> month (short text, e.g., Jan)
        // yyyy -> year
        // HH  -> hour (24-hour format)
        // mm  -> minutes
        // ss  -> seconds
        java.time.format.DateTimeFormatter inputFormatter =
                java.time.format.DateTimeFormatter.ofPattern(
                        "dd-MMM-yyyy HH:mm:ss"
                );

        // Parse the input string into a LocalDateTime object
        LocalDateTime dateTime =
                LocalDateTime.parse(input, inputFormatter);

        // Formatter for the desired output format
        java.time.format.DateTimeFormatter outputFormatter =
                DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");

        // Format and print the date-time in the new format
        System.out.println(dateTime.format(outputFormatter));
    }
}
