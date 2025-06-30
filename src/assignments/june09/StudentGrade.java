package assignments.june09;

import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks
        System.out.print("Enter the student's marks (0-100): ");
        int marks = scanner.nextInt();

        // Check and assign grade
        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade: A+");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else if (marks >= 50) {
            System.out.println("Grade: D");
        } else if (marks >= 40) {
            System.out.println("Grade: E");
        } else if (marks >= 0) {
            System.out.println("Grade: F (Fail)");
        } else {
            System.out.println("Invalid marks entered.");
        }

        scanner.close();
    }
}
