package assignments.june09;

import java.util.Scanner;

public class VowelCounter {

    public int countVowels(String text) {
        int count = 0;
        text = text.toLowerCase(); // Convert to lowercase for simplicity

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        VowelCounter vc = new VowelCounter();

        int vowels = vc.countVowels(input);

        System.out.println("Total number of vowels: " + vowels);

    }
}
