package org.gevernova.JavaEightFeatures.PolicyHolder;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    /**
     * Filters and displays policy holders who:
     * - Have policy type as "Life"
     * - Are older than 60 years
     *
     * @param policyHolderList List of policy holders
     */
    public static void filter(List<PolicyHolder> policyHolderList) {
        policyHolderList.stream()
                // Filter by policy type
                .filter(s -> s.getPolicyType().equalsIgnoreCase("life"))
                // Filter by age
                .filter(s -> s.getAge() > 60)
                // Print filtered policy holders
                .forEach(System.out::println);
    }

    /**
     * Transforms PolicyHolder objects into RiskHolder objects.
     * Risk score is calculated as:
     * premiumAmount / age
     *
     * @param policyHolderList List of policy holders
     * @return List of RiskHolder objects
     */
    public static List<RiskHolder> Transform(List<PolicyHolder> policyHolderList) {
        return policyHolderList.stream()
                .map(s -> new RiskHolder(
                        s.getHolderId(),              // Holder ID
                        s.getName(),                  // Holder name
                        (s.getPremiumAmount()) / s.getAge() // Risk score
                ))
                .toList();
    }

    /**
     * Sorts risk holders in descending order
     * based on risk score.
     *
     * @param riskHolders List of RiskHolder objects
     * @return Sorted list of RiskHolder
     */
    public static List<RiskHolder> Sort(List<RiskHolder> riskHolders) {
        return riskHolders.stream()
                .sorted((a, b) -> Double.compare(b.getScore(), a.getScore()))
                .toList();
    }

    /**
     * Groups risk holders into:
     * - "low risk"  -> score < 0.5
     * - "high risk" -> score >= 0.5
     * Each group contains only policy holder names.
     *
     * @param riskHolders List of RiskHolder objects
     * @return Map of risk category -> list of holder names
     */
    public static Map<String, List<String>> group(List<RiskHolder> riskHolders) {
        return riskHolders.stream()
                .collect(Collectors.groupingBy(
                        p -> (p.getScore() < 0.5) ? "low risk" : "high risk",
                        Collectors.mapping(
                                RiskHolder::getName,
                                Collectors.toList()
                        )
                ));
    }

    public static void main(String[] args) {

        // Create list of PolicyHolder objects
        List<PolicyHolder> policyHolderList = new ArrayList<>();
        policyHolderList.add(new PolicyHolder(1, "Shiva Verma", 72, "Life", 25.00));
        policyHolderList.add(new PolicyHolder(2, "Shivam Verma", 56, "education", 10.00));
        policyHolderList.add(new PolicyHolder(3, "Shivanshu Verma", 43, "Life", 15.00));
        policyHolderList.add(new PolicyHolder(4, "Shivani Verma", 26, "life", 25.00));
        policyHolderList.add(new PolicyHolder(5, "Shiv Verma", 28, "education", 25.00));
        policyHolderList.add(new PolicyHolder(6, "Shivang Verma", 24, "life", 50.00));
        policyHolderList.add(new PolicyHolder(7, "Shiva Kumar", 43, "education", 50.00));
        policyHolderList.add(new PolicyHolder(8, "Komal Raj", 32, "life", 50.00));
        policyHolderList.add(new PolicyHolder(9, "Shiva Raj", 62, "life", 15.00));

        // Apply filter operation
        System.out.println("---- Filtered List ----");
        filter(policyHolderList);

        // Transform PolicyHolder list into RiskHolder list
        System.out.println("---- Transform List ----");
        List<RiskHolder> riskHolders = Transform(policyHolderList);
        riskHolders.forEach(System.out::println);

        // Sort risk holders by risk score
        System.out.println("---- sorted list ------");
        List<RiskHolder> sortedRiskHolders = Sort(riskHolders);
        sortedRiskHolders.forEach(System.out::println);

        // Group risk holders into high risk and low risk
        System.out.println("---- Grouped Risk Holders ----");
        Map<String, List<String>> map = group(sortedRiskHolders);
        System.out.println(map);
    }
}

