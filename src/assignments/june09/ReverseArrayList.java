package assignments.june09;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

    public static void main(String[] args) {
        // Create and populate the ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        System.out.println("Original ArrayList: " + fruits);

        // Reverse the ArrayList
        Collections.reverse(fruits);

        // Print the reversed ArrayList
        System.out.println("Reversed ArrayList: " + fruits);
    }
}
