package assignments.june25;

public class Product {

    private int productId;
    private String productName;
    private int quantity;

    // Constructor
    public Product(int productId, String productName, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
    }

    // Method to update quantity with exception handling
    public void updateQuantity(int amount) {
        try {
            if (amount < 0) {
                throw new IllegalArgumentException("Quantity cannot be negative.");
            }
            this.quantity += amount;
            System.out.println("Updated quantity of " + productName + ": " + quantity);
        } catch (IllegalArgumentException e) {
            System.out.println("Error updating quantity for " + productName + ": " + e.getMessage());
        }
    }

    // Method to display product details
    public void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Available Quantity: " + quantity);
        System.out.println("-----------------------------");
    }
}
