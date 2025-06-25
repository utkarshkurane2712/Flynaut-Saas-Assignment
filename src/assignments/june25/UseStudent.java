package assignments.june25;

public class UseStudent {

    public static void main(String[] args) {
        // Create student instances
        Student s1 = new Student(1, "Utkarsh");
        Student s2 = new Student(2, "Chetan");

        // Set age with valid and invalid inputs
        try {
            s1.setAge(20); // Valid age
        } catch (IllegalArgumentException e) {
            System.out.println("Error setting age for " + s1 + ": " + e.getMessage());
        }

        try {
            s2.setAge(3); // Invalid age
        } catch (IllegalArgumentException e) {
            System.out.println("Error setting age for Bob: " + e.getMessage());
        }

        // Display student details
        System.out.println("\nStudent Details:");
        s1.displayDetails();
        System.out.println("=================================");
        s2.displayDetails(); // Age will remain 0 or unset if exception occurred
    }
}
