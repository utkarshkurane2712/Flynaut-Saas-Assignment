package assignments.june09;

import java.util.ArrayList;

public class IncreaseArrayListSize {

    public static void main(String[] args) {
        // Create an ArrayList with initial capacity
        ArrayList<String> list = new ArrayList<>(2);

        // Add initial elements
        list.add("Apple");
        list.add("Banana");

        // Print current size
        System.out.println("Initial size: " + list.size());
        System.out.println("List: " + list);

        // Increase size by adding more elements
        list.add("Cherry");
        list.add("Date");

        // Print new size
        System.out.println("Increased size: " + list.size());
        System.out.println("Updated List: " + list);
    }
}
