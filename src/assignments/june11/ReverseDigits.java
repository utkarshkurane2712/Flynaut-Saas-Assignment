package assignments.june11;

import java.util.Scanner;

public class ReverseDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for an integer input
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int reversed = 0;

        // Use a while loop to reverse the digits
        while (number != 0) {
            int digit = number % 10;         // Get the last digit
            reversed = reversed * 10 + digit; // Append the digit to reversed
            number = number / 10;             // Remove the last digit
        }

        System.out.println("Reversed number: " + reversed);

    }
}
