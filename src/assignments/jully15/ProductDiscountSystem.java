package assignments.jully15;

import java.util.Scanner;

public class ProductDiscountSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter product price: ");
            double price = scanner.nextDouble();

            System.out.print("Enter discount percentage: ");
            double discount = scanner.nextDouble();

            if (price <= 0) {
                throw new ProductExceptions.InvalidPriceException("Product price must be greater than zero.");
            }

            if (discount < 0 || discount > 50) {
                throw new ProductExceptions.InvalidDiscountException("Discount must be between 0% and 50%.");
            }

            double discountedPrice = price - (price * discount / 100);
            System.out.println("Final price after discount: ₹" + discountedPrice);

        } catch (ProductExceptions.InvalidPriceException | ProductExceptions.InvalidDiscountException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Discount calculation complete.");
        }

        scanner.close();
    }
}
