package assignments.june11;

import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of rows
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Inner loop for numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }

    }
}
