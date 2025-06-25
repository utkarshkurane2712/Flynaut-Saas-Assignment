package assignments.june09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {

    public static void main(String[] args) {
        // Define an array
        String[] array = {"Apple", "Banana", "Cherry", "Date"};

        // Convert array to ArrayList
        List<String> arrayList = new ArrayList<>(Arrays.asList(array));

        // Print the ArrayList
        System.out.println("ArrayList: " + arrayList);
    }
}
