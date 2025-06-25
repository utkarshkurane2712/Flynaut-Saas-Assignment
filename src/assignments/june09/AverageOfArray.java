package assignments.june09;

public class AverageOfArray {

    public static void main(String[] args) {
        // Define an array
        int[] numbers = {10, 20, 30, 40, 50};

        int sum = 0;

        // Calculate sum of array elements
        for (int num : numbers) {
            sum += num;
        }

        // Calculate average
        double average = (double) sum / numbers.length;

        // Print result
        System.out.println("Average value of array elements: " + average);
    }
}
