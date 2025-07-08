package assignments.jully08;

import java.util.ArrayList;

public class FruitList {

    public static void main(String[] args) {
        // Step 1: Create a List of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Step 2: Add five fruit names
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grapes");

        // Step 3: Print the list
        System.out.println("Original list of fruits:");
        System.out.println(fruits);

        // Step 4: Remove the second element (index 1)
        fruits.remove(1); // Removes "Banana"

        // Step 5: Update the last element
        fruits.set(fruits.size() - 1, "Pineapple"); // Replace "Grapes" with "Pineapple"

        // Step 6: Print the modified list
        System.out.println("Modified list of fruits:");
        System.out.println(fruits);
    }
}
