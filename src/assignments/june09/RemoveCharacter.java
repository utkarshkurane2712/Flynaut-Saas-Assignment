package assignments.june09;

import java.util.Scanner;

public class RemoveCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Input character to remove
        System.out.print("Enter the character to remove: ");
        char ch = sc.next().charAt(0);

        // Remove the character
        String result = input.replace(Character.toString(ch), "");

        // Output the result
        System.out.println("String after removing '" + ch + "': " + result);

        sc.close();
    }
}
