package assignments.june25;

public class UseProduct {

    public static void main(String[] args) {

        // Create product instances
        Product p1 = new Product(101, "Laptop", 10);
        Product p2 = new Product(102, "Smartphone", 20);
        Product p3 = new Product(103, "Headphones", 5);

        // Update quantities (valid and invalid)
        p1.updateQuantity(5);      // Valid
        p2.updateQuantity(-3);     // Invalid
        p3.updateQuantity(10);     // Valid
        p3.updateQuantity(-1);     // Invalid

        // Display final inventory
        System.out.println("\nFinal Inventory:");
        p1.displayProduct();
        p2.displayProduct();
        p3.displayProduct();
    }
}
