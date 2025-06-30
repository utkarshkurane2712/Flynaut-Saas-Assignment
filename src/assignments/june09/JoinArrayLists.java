package assignments.june09;

import java.util.ArrayList;

public class JoinArrayLists {

    public static void main(String[] args) {
        // First ArrayList
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");

        // Second ArrayList
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Cherry");
        list2.add("Date");

        // Join list2 into list1
        list1.addAll(list2);

        // Print the merged ArrayList
        System.out.println("Joined ArrayList: " + list1);
    }
}
