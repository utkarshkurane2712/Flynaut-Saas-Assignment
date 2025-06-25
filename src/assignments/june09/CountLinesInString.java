package assignments.june09;

import java.util.Scanner;

public class CountLinesInString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user to enter a multi-line string
        System.out.println("Enter your text (end input with an empty line):");

        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = sc.nextLine();
            if (line.isEmpty()) {
                break; // Stop when an empty line is entered
            }
            sb.append(line).append("\n");
        }

        String input = sb.toString();

        // Split the string by newline character and count lines
        String[] lines = input.split("\n");

        System.out.println("Total number of lines: " + lines.length);

        sc.close();
    }
}
