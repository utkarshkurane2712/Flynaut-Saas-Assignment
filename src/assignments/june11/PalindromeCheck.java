package assignments.june11;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int originalNumber = scanner.nextInt();

        int number = originalNumber;
        int reversed = 0;

        // Reverse the number using a while loop
        while (number != 0) {
            int digit = number % 10;           // Extract the last digit
            reversed = reversed * 10 + digit;  // Append it to reversed
            number = number / 10;              // Remove the last digit
        }

        // Check if the original number is equal to its reversed version
        if (originalNumber == reversed) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
    }
}
