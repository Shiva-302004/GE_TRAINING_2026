package org.gevernova.JavaEightFeatures.BookRecommendations;

/**
 * Represents a simplified book recommendation.
 * Stores only the book title and its rating,
 * typically used as output of recommendation logic.
 */
public class BookRecomendation {

    // Title of the recommended book
    String title;

    // Rating of the recommended book
    double rating;

    /**
     * Constructor to initialize recommendation details.
     *
     * @param title  Book title
     * @param rating Book rating
     */
    public BookRecomendation(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }

    /**
     * @return Book title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the book title.
     *
     * @param title New title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return Book rating
     */
    public double getRating() {
        return rating;
    }

    /**
     * Sets the book rating.
     *
     * @param rating New rating value
     */
    public void setRating(double rating) {
        this.rating = rating;
    }

    /**
     * Returns a readable string representation
     * of the BookRecomendation object.
     *
     * @return String describing the recommendation
     */
    @Override
    public String toString() {
        return "BookRecomendation{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                '}';
    }
}
