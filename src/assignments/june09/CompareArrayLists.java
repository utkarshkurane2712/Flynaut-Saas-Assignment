package assignments.june09;

import java.util.ArrayList;

public class CompareArrayLists {

    public static void main(String[] args) {
        // Create first ArrayList
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");

        // Create second ArrayList
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Apple");
        list2.add("Banana");
        list2.add("Cherry");

        // Compare the two lists
        boolean areEqual = list1.equals(list2);

        // Print the result
        if (areEqual) {
            System.out.println("The two ArrayLists are equal.");
        } else {
            System.out.println("The two ArrayLists are NOT equal.");
        }
    }
}
