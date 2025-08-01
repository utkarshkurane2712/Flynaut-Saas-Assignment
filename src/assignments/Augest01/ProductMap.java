package assignments.Augest01;

import java.util.LinkedHashMap;
import java.util.Map;

public class ProductMap {

    public static void main(String[] args) {
        // Create a LinkedHashMap to store product IDs and names
        LinkedHashMap<Integer, String> productMap = new LinkedHashMap<>();

        // Add items in random order
        productMap.put(2003, "Laptop");
        productMap.put(1001, "Smartphone");
        productMap.put(3005, "Tablet");
        productMap.put(1500, "Headphones");
        productMap.put(1200, "Smartwatch");

        // Add a duplicate key (this will replace the old value for that key)
        productMap.put(1001, "Gaming Phone"); // Duplicate key with a new value

        // Print the entries to observe the insertion order
        System.out.println("Product IDs and Names (in insertion order):");
        for (Map.Entry<Integer, String> entry : productMap.entrySet()) {
            System.out.println("Product ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
