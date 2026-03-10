package org.gevernova.JavaEightFeatures.FraudDetection;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Entry point for Fraud Detection analysis.
 * Demonstrates filtering, grouping, aggregation,
 * and alert generation using Java 8 Streams.
 */
public class Main {

    /**
     * Filters and displays transactions that:
     * - Are marked as fraudulent
     * - Have an amount greater than 10,000
     *
     * @param transactions List of transactions
     */
    public static void filter(List<Transaction> transactions) {
        transactions.stream()
                .filter(s -> {
                    return s.isFraudulent && s.getAmount() > 10000;
                })
                .forEach(System.out::println);
    }

    /**
     * Groups transactions by policy number.
     *
     * @param transactions List of transactions
     * @return Map of policyNumber -> list of transactions
     */
    public static Map<String, List<Transaction>> group(List<Transaction> transactions) {
        return transactions.stream()
                .collect(Collectors.groupingBy(
                        Transaction::getPolicyNumber,
                        Collectors.toList()
                ));
    }

    /**
     * Aggregates fraud data for each policy number.
     * Calculates:
     * - Total number of fraudulent transactions
     * - Total fraud amount
     *
     * @param map Grouped transactions by policy number
     */
    public static void Aggregate(Map<String, List<Transaction>> map) {

        for (Map.Entry<String, List<Transaction>> entry : map.entrySet()) {

            String policyNumber = entry.getKey();
            List<Transaction> frauds = entry.getValue();

            // Count number of fraud transactions
            int fraudCount = frauds.size();

            // Calculate total fraud amount
            double totalFraudAmount = frauds.stream()
                    .mapToDouble(Transaction::getAmount)
                    .sum();

            System.out.println(
                    policyNumber + "  --->  "
                            + fraudCount + " fraudCount "
                            + totalFraudAmount
            );
        }
    }

    /**
     * Generates alerts based on fraud thresholds.
     * Alert is raised if:
     * - Fraud count > 5 OR
     * - Total fraud amount > 50,000
     *
     * @param map Grouped transactions by policy number
     */
    public static void Alert(Map<String, List<Transaction>> map) {

        for (Map.Entry<String, List<Transaction>> entry : map.entrySet()) {

            String policyNumber = entry.getKey();
            List<Transaction> frauds = entry.getValue();

            int fraudCount = frauds.size();
            double totalFraudAmount = frauds.stream()
                    .mapToDouble(Transaction::getAmount)
                    .sum();

            // Check alert conditions
            if (fraudCount > 5 || totalFraudAmount > 50000) {
                System.out.println(" ALERT!");
                System.out.println("Policy Number: " + policyNumber);
                System.out.println("Fraud Count: " + fraudCount);
                System.out.println("Total Fraud Amount: $" + totalFraudAmount);
                System.out.println("----------------------------");
            }
        }
    }

    public static void main(String[] args) {

        // Create sample list of transactions
        List<Transaction> transactions = List.of(
                new Transaction(1, "P101", 15000, LocalDate.now(), true),
                new Transaction(2, "P102", 12000, LocalDate.now(), true),
                new Transaction(3, "P101", 18000, LocalDate.now(), true),
                new Transaction(4, "P102", 9000,  LocalDate.now(), true),
                new Transaction(5, "P101", 20000, LocalDate.now(), false),
                new Transaction(6, "P101", 17000, LocalDate.now(), true),
                new Transaction(7, "P102", 60000, LocalDate.now(), true)
        );

        // Filter transactions based on fraud flag and amount
        System.out.println("--- filtered List ----");
        filter(transactions);

        // Group transactions by policy number
        System.out.println("--- Grouped Map ----");
        Map<String, List<Transaction>> map = group(transactions);
        System.out.println(map);

        // Aggregate fraud data per policy
        System.out.println("---- aggregate -----");
        Aggregate(map);

        // Generate alerts based on thresholds
        Alert(map);
    }
}
