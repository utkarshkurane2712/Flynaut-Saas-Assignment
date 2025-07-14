package assignments.jully08;

public class VotingEligibility {

    // Method that throws an exception if age is less than 18
    public static void checkAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            // Throwing exception explicitly
            throw new IllegalArgumentException("Age must be 18 or above to vote.");
        } else {
            System.out.println("Eligible to vote.");
        }
    }

    public static void main(String[] args) {
        try {
            // Test with user-defined age
            int age = 16;  // Change this value to test
            checkAge(age);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }
}
