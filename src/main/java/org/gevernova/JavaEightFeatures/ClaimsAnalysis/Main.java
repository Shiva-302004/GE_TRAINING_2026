package org.gevernova.JavaEightFeatures.ClaimsAnalysis;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Entry point for Claims Analysis.
 * Demonstrates filtering, grouping,
 * and aggregation using Java 8 Streams.
 */
public class Main {

    /**
     * Filters and displays claims that:
     * - Have status as "Approved"
     * - Have claim amount greater than 5000
     *
     * @param claims List of insurance claims
     */
    public static void filter(List<Claim> claims) {
        claims.stream()
                // Filter approved claims
                .filter(s -> s.getStatus().equalsIgnoreCase("Approved"))
                // Filter claims with amount greater than 5000
                .filter(s -> s.getGetClaimAmount() > 5000)
                // Print filtered claims
                .forEach(System.out::println);
    }

    /**
     * Groups claims by policy number and
     * maps each policy to a list of claim IDs.
     *
     * @param claims List of insurance claims
     * @return Map of policyNumber -> list of claim IDs
     */
    public static Map<Integer, List<Integer>> GroupingByDepartment(List<Claim> claims) {
        return claims.stream()
                .collect(Collectors.groupingBy(
                        Claim::getPolicyNumber,                 // Group by policy number
                        Collectors.mapping(
                                Claim::getClaimId,              // Extract claim ID
                                Collectors.toList()              // Collect IDs into a list
                        )
                ));
    }

    /**
     * Calculates the average claim amount
     * for each policy number.
     *
     * @param claims List of insurance claims
     * @return Map of policyNumber -> average claim amount
     */
    public static Map<Integer, Double> Aggregate(List<Claim> claims) {
        return claims.stream()
                .collect(Collectors.groupingBy(
                        Claim::getPolicyNumber,                 // Group by policy number
                        Collectors.averagingDouble(
                                Claim::getGetClaimAmount         // Average claim amount
                        )
                ));
    }

    public static void main(String[] args) {

        // Create a list of Claim objects
        List<Claim> claims = new ArrayList<>(
                List.of(
                        new Claim(101, 2022, 40000, "2026-01-12", "approved"),
                        new Claim(102, 2023, 40000, "2026-01-12", "pending"),
                        new Claim(103, 2022, 3000, "2026-01-12", "rejected"),
                        new Claim(104, 2024, 40000, "2026-01-12", "approved"),
                        new Claim(105, 2022, 3000, "2026-01-12", "approved"),
                        new Claim(106, 2023, 40000, "2026-01-12", "rejected"),
                        new Claim(107, 2022, 6000, "2026-01-12", "approved"),
                        new Claim(108, 2024, 45000, "2026-01-12", "approved"),
                        new Claim(109, 2024, 40000, "2026-01-12", "rejected"),
                        new Claim(110, 2025, 40000, "2026-01-12", "approved"),
                        new Claim(111, 2025, 40000, "2026-01-12", "rejected")
                )
        );

        // Filter claims based on status and amount
        System.out.println("--- filtered list on basis of department and salary ---");
        filter(claims);

        // Group claims by policy number and print claim IDs
        System.out.println("---- create map with department and employees names");
        Map<Integer, List<Integer>> mp = GroupingByDepartment(claims);
        System.out.println(mp);

        // Calculate and print average claim amount per policy
        System.out.println("---- create map with department and average salary");
        Map<Integer, Double> map = Aggregate(claims);
        System.out.println(map);
    }
}
