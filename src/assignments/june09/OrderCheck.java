package assignments.june09;

import java.util.Scanner;

public class OrderCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept three numbers
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter third number: ");
        int c = scanner.nextInt();

        // Check order
        if (a < b && b < c) {
            System.out.println("Numbers are in increasing order.");
        } else if (a > b && b > c) {
            System.out.println("Numbers are in decreasing order.");
        } else {
            System.out.println("Numbers are in neither increasing nor decreasing order.");
        }

        scanner.close();
    }
}
