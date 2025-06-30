package assignments.june09;

import java.util.ArrayList;
import java.util.Collections;

public class SwapArrayListElements {

    public static void main(String[] args) {
        // Create and populate the ArrayList
        ArrayList<String> items = new ArrayList<>();
        items.add("Red");
        items.add("Green");
        items.add("Blue");
        items.add("Yellow");

        System.out.println("Original ArrayList: " + items);

        // Swap elements at index 1 and 3 (Green and Yellow)
        Collections.swap(items, 1, 3);

        System.out.println("After Swapping: " + items);
    }
}
