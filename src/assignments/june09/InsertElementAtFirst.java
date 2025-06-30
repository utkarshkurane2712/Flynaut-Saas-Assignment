package assignments.june09;

import java.util.ArrayList;

public class InsertElementAtFirst {

    public static void main(String[] args) {
        // Create ArrayList and add elements
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Insert element at the first position (index 0)
        fruits.add(0, "Orange");

        // Print the updated ArrayList
        System.out.println("Updated ArrayList: " + fruits);
    }
}
