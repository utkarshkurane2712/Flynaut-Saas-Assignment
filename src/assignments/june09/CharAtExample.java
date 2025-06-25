package assignments.june09;

import java.util.Scanner;

public class CharAtExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Input index
        System.out.print("Enter an index: ");
        int index = sc.nextInt();

        // Check if index is valid
        if (index >= 0 && index < input.length()) {
            char ch = input.charAt(index);
            System.out.println("Character at index " + index + " is: " + ch);
        } else {
            System.out.println("Invalid index. Please enter a value between 0 and " + (input.length() - 1));
        }

        sc.close();
    }
}
