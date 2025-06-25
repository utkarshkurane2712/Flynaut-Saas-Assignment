package assignments.june09;

public class MaxMinArray {

    public static void main(String[] args) {
        // Define an array
        int[] numbers = {25, 12, 89, 5, 42, 77};

        // Initialize max and min with the first element
        int max = numbers[0];
        int min = numbers[0];

        // Loop through the array
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        // Output the results
        System.out.println("Maximum value in the array: " + max);
        System.out.println("Minimum value in the array: " + min);
    }
}
