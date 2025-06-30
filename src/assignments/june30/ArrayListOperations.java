package assignments.june30;

import java.util.ArrayList;

public class ArrayListOperations {

    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add 5 integers to the list
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Insert an integer at the second position (index 1)
        numbers.add(1, 15);

        // Remove an integer by its value
        numbers.remove(Integer.valueOf(30));

        // Remove an integer by its index
        numbers.remove(2);

        // Find the sum of all elements
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        // Print final list and sum
        System.out.println("Final ArrayList: " + numbers);
        System.out.println("Sum of elements: " + sum);
    }
}
