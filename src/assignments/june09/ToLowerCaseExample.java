package assignments.june09;

import java.util.Scanner;

public class ToLowerCaseExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert to lowercase
        String lower = input.toLowerCase();

        // Output result
        System.out.println("Lowercase string: " + lower);

        sc.close();
    }
}
