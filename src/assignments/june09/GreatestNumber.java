package assignments.june09;

import java.util.Scanner;

public class GreatestNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take three numbers from user
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter third number: ");
        int c = scanner.nextInt();

        // Find the greatest number
        int greatest;

        if (a >= b && a >= c) {
            greatest = a;
        } else if (b >= a && b >= c) {
            greatest = b;
        } else {
            greatest = c;
        }

        // Print result
        System.out.println("The greatest number is: " + greatest);

        scanner.close();
    }
}
