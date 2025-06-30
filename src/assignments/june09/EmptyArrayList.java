package assignments.june09;

import java.util.ArrayList;

public class EmptyArrayList {

    public static void main(String[] args) {
        // Create and populate the ArrayList
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("Original ArrayList: " + colors);

        // Empty the ArrayList
        colors.clear();

        // Print the ArrayList after clearing
        System.out.println("ArrayList after clearing: " + colors);
    }
}
