package assignments.june09;

import java.util.ArrayList;

public class RemoveThirdElement {

    public static void main(String[] args) {
        // Create and populate the ArrayList
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        System.out.println("Original ArrayList: " + colors);

        // Remove the third element (index 2)
        colors.remove(2);
        System.out.println("After removing third element: " + colors);
    }
}
