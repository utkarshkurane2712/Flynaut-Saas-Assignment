package assignments.june09;

public class SumOfArray {

    public static void main(String[] args) {
        // Define an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Variable to store the sum
        int sum = 0;

        // Loop through the array and add each element to sum
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Print the result
        System.out.println("Sum of array elements: " + sum);
    }
}
