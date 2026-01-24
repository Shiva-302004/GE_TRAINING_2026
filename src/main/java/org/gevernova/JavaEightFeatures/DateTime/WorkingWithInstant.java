package org.gevernova.JavaEightFeatures.DateTime;

import java.time.Duration;
import java.time.Instant;

/**
 * Demonstrates measuring execution time
 * using Instant and Duration in Java 8.
 */
public class WorkingWithInstant {

    public static void main(String[] args) {

        // Capture the start time using Instant
        Instant start = Instant.now();

        // Sample loop to simulate some processing work
        for (int i = 0; i < 1000000000; i++) {
            // empty loop body
        }

        // Capture the end time using Instant
        Instant end = Instant.now();

        // Calculate the duration between start and end instants
        long timeTaken = Duration.between(start, end).getSeconds();

        // Print the execution time in seconds
        System.out.println("Execution time: " + timeTaken + " seconds");
    }
}
