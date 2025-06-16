package assignments.june11;

import java.util.Scanner;

public class SumPositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int sum = 0;

        // Use a do-while loop to ensure the prompt runs at least once
        do {
            System.out.print("Enter a number (negative number to stop): ");
            number = scanner.nextInt();

            if (number >= 0) {
                sum += number;  // Add to sum if the number is positive or zero
            }

        } while (number >= 0);  // Continue loop as long as number is non-negative

        System.out.println("Sum of all positive numbers: " + sum);
    }
}
