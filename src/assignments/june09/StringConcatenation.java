package assignments.june09;

import java.util.Scanner;

public class StringConcatenation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first string
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();

        // Input second string
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();

        // Concatenate strings
        String result = str1 + str2;

        // Output the result
        System.out.println("Concatenated String: " + result);

        sc.close();
    }
}
