package assignments.june09;

import java.util.Scanner;

public class SumAndAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number;
        int count = 5;

        System.out.println("Enter 5 numbers:");

        // Loop to take 5 inputs
        for (int i = 1; i <= count; i++) {
            System.out.print("Number " + i + ": ");
            number = scanner.nextInt();
            sum += number;
        }

        // Calculate average
        double average = (double) sum / count;

        // Output
        System.out.println("\nSum = " + sum);
        System.out.println("Average = " + average);

        scanner.close();
    }
}
