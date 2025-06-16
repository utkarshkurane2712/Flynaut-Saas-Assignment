package assignments.june9;

import java.util.Scanner;

public class WordCounter {
    public int countWords(String text) {
        // Trim the string to remove leading/trailing spaces
        // and split by one or more spaces using regex
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }

        String[] words = text.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        WordCounter obj = new WordCounter();

        // Call method
        int wordCount = obj.countWords(input);

        // Display result
        System.out.println("Total number of words: " + wordCount);
    }
}
