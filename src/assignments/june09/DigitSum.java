package assignments.june09;

import java.util.Scanner;

public class DigitSum {

    public int sumOfDigits(int number) {
        int sum = 0;
        number = Math.abs(number); // Handle negative input

        while (number > 0) {
            sum += number % 10;    // Add the last digit
            number = number / 10;  // Remove the last digit
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input an integer
        System.out.print("Enter an integer: ");
        int input = scanner.nextInt();

        DigitSum obj = new DigitSum();

        int result = obj.sumOfDigits(input);
        System.out.println("Sum of digits: " + result);

    }
}
