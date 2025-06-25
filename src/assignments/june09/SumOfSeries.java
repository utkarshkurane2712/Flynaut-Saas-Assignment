package assignments.june09;

import java.util.Scanner;

public class SumOfSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input n
        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();

        int sum = 0;

        // Calculate sum of series
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        // Display result
        System.out.println("Sum of the series 1 + 2 + ... + " + n + " = " + sum);

        scanner.close();
    }
}
