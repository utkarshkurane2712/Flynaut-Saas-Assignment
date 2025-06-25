package assignments.june09;

import java.util.Scanner;

public class StudentMarks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] marks = new int[5];
        int total = 0;

        // Input marks for 5 subjects
        System.out.println("Enter marks for 5 subjects (out of 100):");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            total += marks[i];
        }

        // Calculate percentage
        double percentage = (double) total / 5;

        // Output results
        System.out.println("\nTotal Marks = " + total + "/500");
        System.out.println("Percentage = " + percentage + "%");

        scanner.close();
    }
}
