package assignments.june09;

import java.util.Arrays;

public class SortNames {

    public static void main(String[] args) {
        String[] names = {"Zara", "Bob", "Alice", "Mike", "John"};

        // Sort the array
        Arrays.sort(names);

        // Print sorted names
        System.out.println("Names in alphabetical order:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
