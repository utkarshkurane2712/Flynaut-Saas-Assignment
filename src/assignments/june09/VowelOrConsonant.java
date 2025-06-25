package assignments.june09;

import java.util.Scanner;

public class VowelOrConsonant {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take a character input
        System.out.print("Enter a single alphabet: ");
        char ch = scanner.next().toLowerCase().charAt(0);

        // Check if the character is a letter
        if (!Character.isLetter(ch)) {
            System.out.println("Invalid input! Please enter an alphabet.");
        } else {
            // Check for vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        }

        scanner.close();
    }
}
