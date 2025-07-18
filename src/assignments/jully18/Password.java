package assignments.jully18;

import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        try {
            if (password.length() < 8) {
                throw new WeakPasswordException("Password must be at least 8 characters long");
            } else {
                System.out.println("Password accepted");
            }
        } catch (WeakPasswordException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
