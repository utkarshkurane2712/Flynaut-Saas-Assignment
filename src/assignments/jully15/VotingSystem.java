package assignments.jully15;

import java.util.Scanner;

public class VotingSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            // Accept user input
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            scanner.nextLine();  // Consume newline

            System.out.print("Enter your nationality: ");
            String nationality = scanner.nextLine().trim();

            // Check age
            if (age < 18) {
                throw new VotingExceptions.UnderageVoterException("You must be at least 18 years old to vote.");
            }

            // Check nationality
            if (!nationality.equalsIgnoreCase("Indian")) {
                throw new VotingExceptions.IneligibleNationalityException("Only Indian citizens are allowed to vote.");
            }

            System.out.println("You are eligible to vote.");

        } catch (VotingExceptions.UnderageVoterException | VotingExceptions.IneligibleNationalityException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Thank you for using the voting eligibility checker.");
        }
    }
}
