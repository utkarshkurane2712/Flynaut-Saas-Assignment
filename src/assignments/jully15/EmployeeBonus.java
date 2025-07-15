package assignments.jully15;

import java.util.Scanner;

public class EmployeeBonus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter employee experience in years: ");
            int experience = scanner.nextInt();

            System.out.print("Enter employee performance rating (1-5): ");
            int rating = scanner.nextInt();

            // Validating experience
            if (experience < 0) {
                throw new EmployeeExceptions.InvalidExperienceException("Experience cannot be negative.");
            }

            // Validating rating
            if (rating < 1 || rating > 5) {
                throw new EmployeeExceptions.InvalidRatingException("Performance rating must be between 1 and 5.");
            }

            // Check if eligible for bonus
            if (rating == 1 || rating == 2) {
                throw new EmployeeExceptions.NoBonusEligibleException("Performance too low. Not eligible for bonus.");
            }

            // Calculate bonus
            double bonusPercentage;
            if (rating == 5) {
                bonusPercentage = 0.20;
            } else if (rating == 4) {
                bonusPercentage = 0.15;
            } else { // rating == 3
                bonusPercentage = 0.10;
            }

            double baseSalary = 50000; // Assume a fixed base salary for demonstration
            double bonus = baseSalary * bonusPercentage + (experience * 1000);

            System.out.println("Employee is eligible for a bonus of: ₹" + bonus);

        } catch (EmployeeExceptions.InvalidExperienceException | EmployeeExceptions.InvalidRatingException |
                 EmployeeExceptions.NoBonusEligibleException e) {

            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Bonus calculation completed.");
        }

        scanner.close();
    }
}
