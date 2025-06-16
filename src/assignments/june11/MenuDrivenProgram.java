package assignments.june11;

import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display menu options
            System.out.println("=== Menu ===");
            System.out.println("1. Calculate Factorial");
            System.out.println("2. Check Prime");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Factorial calculation
                    System.out.print("Enter a number to calculate factorial: ");
                    int num = scanner.nextInt();
                    long factorial = 1;
                    for (int i = 1; i <= num; i++) {
                        factorial *= i;
                    }
                    System.out.println("Factorial of " + num + " is: " + factorial);
                    break;

                case 2:
                    // Prime number check
                    System.out.print("Enter a number to check if it's prime: ");
                    int primeNum = scanner.nextInt();
                    boolean isPrime = true;

                    if (primeNum <= 1) {
                        isPrime = false;
                    } else {
                        for (int i = 2; i <= Math.sqrt(primeNum); i++) {
                            if (primeNum % i == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                    }

                    if (isPrime) {
                        System.out.println(primeNum + " is a prime number.");
                    } else {
                        System.out.println(primeNum + " is not a prime number.");
                    }
                    break;

                case 3:
                    // Exit option
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    // Invalid input
                    System.out.println("Invalid choice. Please select 1, 2, or 3.");
            }

        } while (choice != 3);  // Repeat until the user chooses to exit
    }
}
