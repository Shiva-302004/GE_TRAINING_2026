package org.gevernova.JavaEightFeatures.DateTime;

import java.time.Duration;
import java.time.ZoneOffset;

/**
 * Demonstrates the use of ZonedDateTime and Duration
 * to calculate time difference between UTC and local time.
 */
public class ZonedDateTime {

    public static void main(String[] args) {

        // Get the current date-time in UTC time zone
        java.time.ZonedDateTime utcTime =
                java.time.ZonedDateTime.now(ZoneOffset.UTC);

        // Get the current date-time in the system's default time zone
        java.time.ZonedDateTime localTime =
                java.time.ZonedDateTime.now();

        // Note:
        // Use Period when working with LocalDate (date-based)
        // Use Duration when working with time or ZonedDateTime (time-based)

        // Calculate the duration between UTC time and local time
        Duration duration = Duration.between(utcTime, localTime);

        // Print the absolute difference in hours and minutes
        System.out.println(
                "Difference: "
                        + Math.abs(duration.toHours()) + " hours "
                        + Math.abs(duration.toMinutes() % 60) + " minutes"
        );
    }
}
