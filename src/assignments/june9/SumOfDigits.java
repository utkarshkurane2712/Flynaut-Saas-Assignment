package assignments.june9;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a positive integer
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        int sum = 0;

        // Sum each digit
        while (number > 0) {
            int digit = number % 10;  // Get the last digit
            sum += digit;             // Add it to the sum
            number = number / 10;     // Remove the last digit
        }

        // Output result
        System.out.println("Sum of digits: " + sum);
    }
}
