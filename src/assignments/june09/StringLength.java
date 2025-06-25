package assignments.june09;

import java.util.Scanner;

public class StringLength {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Get length of the string
        int length = input.length();

        // Output the length
        System.out.println("Length of the string is: " + length);

        sc.close();
    }
}
