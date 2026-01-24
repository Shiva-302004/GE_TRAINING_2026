package org.gevernova.JavaEightFeatures.BookRecommendations;

import java.util.ArrayList;
import java.util.List;

/**
 * Entry point for Book Recommendation system.
 * Demonstrates filtering, transformation,
 * sorting, and pagination using Java 8 Streams.
 */
public class Main {

    /**
     * Filters books based on genre and rating.
     * Criteria:
     * - Genre must be "Science Fiction"
     * - Rating must be greater than 4
     *
     * @param books List of books
     */
    public static void filter(List<Book> books) {
        books.stream()
                // Filter books by genre
                .filter(s -> s.getGenre().equalsIgnoreCase("Science Fiction"))
                // Filter books by rating
                .filter(s -> (s.rating > 4))
                // Print filtered books
                .forEach(System.out::println);
    }

    /**
     * Transforms Book objects into BookRecomendation objects.
     * Only title and rating are extracted.
     *
     * @param books List of books
     * @return List of BookRecomendation
     */
    public static List<BookRecomendation> Transform(List<Book> books) {
        return books.stream()
                // Map Book to BookRecomendation
                .map(s -> new BookRecomendation(s.title, s.rating))
                .toList();
    }

    /**
     * Sorts and displays book recommendations
     * in descending order of rating.
     *
     * @param newlist List of BookRecomendation
     */
    public static void sorted(List<BookRecomendation> newlist) {
        newlist.stream()
                // Sort by rating (highest first)
                .sorted((a, b) -> Double.compare(b.rating, a.rating))
                // Print sorted recommendations
                .forEach(System.out::println);
    }

    /**
     * Implements pagination for book recommendations.
     * Steps:
     * - Sort by rating
     * - Take top 10 books
     * - Display results page-wise (5 books per page)
     *
     * @param newlist List of BookRecomendation
     */
    public static void pagination(List<BookRecomendation> newlist) {

        // Sort by rating and limit to top 10 books
        List<BookRecomendation> top10 = newlist.stream()
                .sorted((a, b) -> Double.compare(b.rating, a.rating))
                .limit(10)
                .toList();

        // Pagination configuration
        int pageSize = 5;
        int totalPages = (int) Math.ceil(top10.size() / (double) pageSize);

        // Display books page by page
        for (int page = 1; page <= totalPages; page++) {

            int start = (page - 1) * pageSize;
            int end = Math.min(start + pageSize, top10.size());

            List<BookRecomendation> pageBooks =
                    top10.subList(start, end);

            System.out.println("Page " + page + ":");
            pageBooks.forEach(System.out::println);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Create a list of Book objects
        List<Book> books = new ArrayList<>(
                List.of(
                        new Book("mercury vs venus", "shiva", "science fiction", 4.5),
                        new Book("comedy night with kapil", "shiva", "comedy", 4.5),
                        new Book("king maker", "shiva", "history", 4.5),
                        new Book("mercury is king", "shiva", "science fiction", 4.5),
                        new Book("sunil pal comedy", "shiva", "comedy", 4.5),
                        new Book("jupiter will  fall on earth", "shiva", "science fiction", 3.5)
                )
        );

        // Filter books by genre and rating
        System.out.println("----- print filtered list -----");
        filter(books);

        // Transform Book list into BookRecomendation list
        System.out.println("--- transformed List ----");
        List<BookRecomendation> newlist = Transform(books);
        System.out.println(newlist);

        // Sort recommendations by rating
        System.out.println("--- sorted list ----");
        sorted(newlist);

        // Display recommendations using pagination
        System.out.println("--- pagination implemented ---");
        pagination(newlist);
    }
}
