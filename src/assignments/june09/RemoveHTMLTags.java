package assignments.june09;

import java.util.Scanner;

public class RemoveHTMLTags {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string with HTML
        System.out.print("Enter a string with HTML tags: ");
        String input = sc.nextLine();

        // Remove HTML tags using regex
        String cleaned = input.replaceAll("<[^>]*>", "");

        // Output result
        System.out.println("String after removing HTML tags: " + cleaned);

        sc.close();
    }
}
