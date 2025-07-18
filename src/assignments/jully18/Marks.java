package assignments.jully18;

import java.util.Scanner;

public class Marks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = scanner.nextInt();

        try {
            if (marks < 0 || marks > 100) {
                throw new InvalidMarksException("Marks should be between 0 and 100");
            } else {
                System.out.println("Marks recorded");
            }
        } catch (InvalidMarksException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
