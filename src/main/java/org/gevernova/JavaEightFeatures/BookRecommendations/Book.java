package org.gevernova.JavaEightFeatures.BookRecommendations;

/**
 * Represents a Book entity used in the
 * Book Recommendation system.
 * Stores book details such as title, author,
 * genre, and rating.
 */
class Book {

    // Title of the book
    String title;

    // Author of the book
    String author;

    // Genre/category of the book
    String genre;

    // Rating of the book
    double rating;

    /**
     * Constructor to initialize book details.
     *
     * @param title  Title of the book
     * @param author Author of the book
     * @param genre  Genre of the book
     * @param rating Rating of the book
     */
    public Book(String title, String author, String genre, double rating) {
        this.title = title;
        this.author = author;
        this.genre = genre;
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
     * @param title New title of the book
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return Book author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the book author.
     *
     * @param author New author name
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return Book genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Sets the book genre.
     *
     * @param genre New genre
     */
    public void setGenre(String genre) {
        this.genre = genre;
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
    public void setRating(int rating) {
        this.rating = rating;
    }

    /**
     * Returns a readable string representation
     * of the Book object.
     *
     * @return String describing the book
     */
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                '}';
    }
}
