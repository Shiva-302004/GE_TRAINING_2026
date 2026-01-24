package org.gevernova.JavaEightFeatures.ProductSalesAnalysis;

import java.util.ArrayList;
import java.util.List;

/**
 * Entry point for Product Sales Analysis.
 * Demonstrates filtering, transformation,
 * sorting, and top-N operations using Java 8 Streams.
 */
public class Main {

    /**
     * Filters and displays sales where quantity sold
     * is greater than 10.
     *
     * @param sales List of sale transactions
     */
    public static void filter(List<Sale> sales) {
        sales.stream()
                .filter(s -> s.getQuantity() > 10)
                .forEach(System.out::println);
    }

    /**
     * Transforms Sale objects into ProductSales objects
     * by calculating total revenue (quantity * price).
     *
     * @param sales List of sale transactions
     * @return List of ProductSales with total revenue
     */
    public static List<ProductSales> Transform(List<Sale> sales) {
        return sales.stream()
                .map(s -> new ProductSales(
                        s.productId,                     // Product ID
                        s.getQuantity() * s.getPrice()   // Total revenue
                ))
                .toList();
    }

    /**
     * Sorts and displays ProductSales in descending order
     * based on total revenue.
     *
     * @param newlist List of ProductSales
     */
    public static void sortedListOnBasisOfTR(List<ProductSales> newlist) {
        newlist.stream()
                .sorted((a, b) -> b.getTr() - a.getTr())
                .forEach(System.out::println);
    }

    /**
     * Displays top 5 products based on total revenue.
     *
     * @param newlist List of ProductSales
     */
    public static void getTopFiveReturn(List<ProductSales> newlist) {
        newlist.stream()
                .sorted((a, b) -> b.getTr() - a.getTr())
                .limit(5)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {

        // Create a list of Sale objects
        List<Sale> sales = new ArrayList<>(
                List.of(
                        new Sale(1, 20, 3000),
                        new Sale(2, 30, 3000),
                        new Sale(3, 40, 304),
                        new Sale(4, 25, 320),
                        new Sale(5, 23, 35000),
                        new Sale(6, 24, 45000),
                        new Sale(7, 22, 4000),
                        new Sale(8, 45, 380),
                        new Sale(9, 70, 300)
                )
        );

        // Filter sales based on quantity
        System.out.println("---- filtered list ----");
        filter(sales);

        // Transform Sale list to ProductSales list
        System.out.println("--- productsales ---");
        List<ProductSales> newlist = Transform(sales);
        System.out.println(newlist);

        // Sort ProductSales by total revenue
        System.out.println("--- sorted list ----");
        sortedListOnBasisOfTR(newlist);

        // Display top 5 products by total revenue
        System.out.println("--- top 5 total returns list ----");
        getTopFiveReturn(newlist);
    }
}
