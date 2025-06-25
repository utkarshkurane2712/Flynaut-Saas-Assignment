package assignments.june09;

import java.util.Scanner;

public class SubstringExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input full string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Input start and end positions
        System.out.print("Enter the starting index: ");
        int start = sc.nextInt();

        System.out.print("Enter the ending index: ");
        int end = sc.nextInt();

        // Check if indices are valid
        if (start >= 0 && end <= input.length() && start < end) {
            // Extract substring
            String result = input.substring(start, end);
            System.out.println("Substring: " + result);
        } else {
            System.out.println("Invalid start or end index.");
        }

        sc.close();
    }
}
