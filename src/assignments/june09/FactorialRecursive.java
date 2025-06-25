package assignments.june09;

import java.util.Scanner;

public class FactorialRecursive {

    // Recursive method to find factorial
    int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case
        } else {
            return n * factorial(n - 1); // Recursive call
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number to find factorial: ");
        int number = sc.nextInt();

        // Create object and call method
        FactorialRecursive obj = new FactorialRecursive();
        int result = obj.factorial(number);

        // Output result
        System.out.println("Factorial of " + number + " is: " + result);

    }
}
