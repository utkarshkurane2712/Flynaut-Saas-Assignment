package assignments.Jully07;

import java.util.Scanner;

public class ProductManagementSystem {

    public static void main(String[] args) {
        ProductService productService = new ProductServiceImpl();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n====== Product Management System ======");
            System.out.println("1. Add Product");
            System.out.println("2. View All Products");
            System.out.println("3. Get Product By ID");
            System.out.println("4. Update Product");
            System.out.println("5. Delete Product");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter Product Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Product Price: ");
                    double price = scanner.nextDouble();
                    productService.addProduct(new Product(id, name, price));
                    System.out.println("✅ Product added successfully!");
                    break;

                case 2:
                    System.out.println("\n📦 All Products:");
                    for (Product p : productService.getAllProducts()) {
                        System.out.println(p);
                    }
                    break;

                case 3:
                    System.out.print("Enter Product ID to search: ");
                    int searchId = scanner.nextInt();
                    Product found = productService.getProductById(searchId);
                    if (found != null) {
                        System.out.println("🔍 Product Found: " + found);
                    } else {
                        System.out.println("❌ Product not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Product ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter New Name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter New Price: ");
                    double newPrice = scanner.nextDouble();
                    boolean updated = productService.updateProduct(updateId, newName, newPrice);
                    if (updated) {
                        System.out.println("✅ Product updated successfully.");
                    } else {
                        System.out.println("❌ Product not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Product ID to delete: ");
                    int deleteId = scanner.nextInt();
                    boolean deleted = productService.removeProduct(deleteId);
                    if (deleted) {
                        System.out.println("🗑️ Product deleted successfully.");
                    } else {
                        System.out.println("❌ Product not found.");
                    }
                    break;

                case 6:
                    System.out.println("👋 Exiting... Thank you!");
                    break;

                default:
                    System.out.println("⚠️ Invalid choice! Try again.");
            }
        } while (choice != 6);


    }
}
