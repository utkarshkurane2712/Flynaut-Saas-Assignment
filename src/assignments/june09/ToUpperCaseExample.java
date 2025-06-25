package assignments.june09;

import java.util.Scanner;

public class ToUpperCaseExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert to uppercase
        String upper = input.toUpperCase();

        // Output result
        System.out.println("Uppercase string: " + upper);

        sc.close();
    }
}
