package assignments.june09;

import java.util.Scanner;

public class TrimStringExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string with whitespaces
        System.out.print("Enter a string with leading or trailing spaces: ");
        String input = sc.nextLine();

        // Trim the string
        String trimmed = input.trim();

        // Output result
        System.out.println("Original String: \"" + input + "\"");
        System.out.println("Trimmed String: \"" + trimmed + "\"");

        sc.close();
    }
}
