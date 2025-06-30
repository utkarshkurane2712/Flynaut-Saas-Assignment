package assignments.june30;

import java.util.ArrayList;

public class ShoppingCart {

    public static void main(String[] args) {
        // Create an ArrayList to store product names
        ArrayList<String> cart = new ArrayList<>();

        // Add 5 product names
        cart.add("Laptop");
        cart.add("Headphones");
        cart.add("Smartphone");
        cart.add("Charger");
        cart.add("Backpack");

        // Insert a new product at the beginning
        cart.addFirst("Notebook");

        // Remove the product at the last position
        cart.removeLast();

        // Count and display the number of items
        int itemCount = cart.size();

        // Output
        System.out.println("Shopping Cart: " + cart);
        System.out.println("Number of items in the cart: " + itemCount);
    }
}
