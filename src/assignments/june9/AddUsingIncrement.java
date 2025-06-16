package assignments.june9;

import java.util.Scanner;

public class AddUsingIncrement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        // Add b to a using ++ or --
        if (b > 0) {
            for (int i = 0; i < b; i++) {
                a++;
            }
        } else {
            for (int i = 0; i > b; i--) {
                a--;
            }
        }

        System.out.println("Sum = " + a);
    }
}
