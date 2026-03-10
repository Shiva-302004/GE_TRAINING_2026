package org.gevernova.JavaEightFeatures.ProductSalesAnalysis;

/**
 * Represents a sale transaction for a product.
 * Stores product details such as product ID,
 * quantity sold, and price per unit.
 */
class Sale {

    // Unique identifier of the product
    int productId;

    // Quantity of the product sold
    int quantity;

    // Price per unit of the product
    int price;

    /**
     * Constructor to initialize sale details.
     *
     * @param productId Unique product ID
     * @param quantity  Quantity sold
     * @param price     Price per unit
     */
    public Sale(int productId, int quantity, int price) {
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }

    /**
     * @return Product ID
     */
    public int getProductId() {
        return productId;
    }

    /**
     * @return Quantity sold
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @return Price per unit
     */
    public int getPrice() {
        return price;
    }

    /**
     * Provides a readable string representation
     * of the Sale object.
     *
     * @return String describing the sale
     */
    @Override
    public String toString() {
        return "Sale{" +
                "productId=" + productId +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
