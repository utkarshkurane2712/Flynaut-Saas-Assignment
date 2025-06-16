package assignments.june9;

import java.util.Scanner;

public class SquareRootCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Compute square root
        double squareRoot = Math.sqrt(number);

        // Display result
        System.out.println("Square root of " + number + " is: " + squareRoot);

    }
}
