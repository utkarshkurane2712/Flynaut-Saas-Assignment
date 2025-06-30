package assignments.june30;

import java.util.Vector;

public class IntegerVector {

    public static void main(String[] args) {
        // Create a Vector to store integers
        Vector<Integer> numbers = new Vector<>();

        // Add 5 numbers to the Vector
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Print all the elements in the Vector
        System.out.println("Elements in the Vector:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
