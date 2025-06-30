package assignments.june09;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for number of terms
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n = scanner.nextInt();

        int first = 0, second = 1;

        System.out.println("Fibonacci series up to " + n + " terms:");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        scanner.close();
    }
}
