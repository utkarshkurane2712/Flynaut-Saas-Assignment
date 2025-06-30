package assignments.june09;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayList {

    public static void main(String[] args) {
        // Create and populate the ArrayList
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");

        System.out.println("Original ArrayList: " + colors);

        // Shuffle the ArrayList
        Collections.shuffle(colors);

        // Print the shuffled ArrayList
        System.out.println("Shuffled ArrayList: " + colors);
    }
}
