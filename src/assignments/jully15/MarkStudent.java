package assignments.jully15;

import java.util.Scanner;

public class MarkStudent {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[3];
        int total = 0;

        try {
            for (int i = 0; i < 3; i++) {
                System.out.print("Enter marks for subject " + (i + 1) + " (0-100): ");
                marks[i] = scanner.nextInt();

                if (marks[i] < 0 || marks[i] > 100) {
                    throw new MarksExceptions.InvalidMarksException("Marks should be between 0 and 100 only.");
                }

                total += marks[i];
            }

            double average = total / 3.0;
            System.out.println("Average Marks: " + average);

            if (average < 35) {
                throw new MarksExceptions.FailException("Result: Fail. Work harder next time.");
            } else {
                System.out.println("Result: Pass");
                if (average >= 75) {
                    System.out.println("Grade: Distinction");
                } else if (average >= 60) {
                    System.out.println("Grade: First Class");
                } else if (average >= 50) {
                    System.out.println("Grade: Second Class");
                } else {
                    System.out.println("Grade: Pass Class");
                }
            }

        } catch (MarksExceptions.InvalidMarksException | MarksExceptions.FailException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Thank you for using the marks checker.");
        }

        scanner.close();
    }
}
