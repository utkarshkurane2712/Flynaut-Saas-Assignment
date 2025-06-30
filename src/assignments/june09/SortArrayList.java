package assignments.june09;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

    public static void main(String[] args) {
        // Create and populate the ArrayList
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Daisy");

        System.out.println("Original ArrayList: " + names);

        // Sort the ArrayList
        Collections.sort(names);

        // Print the sorted ArrayList
        System.out.println("Sorted ArrayList: " + names);
    }
}
