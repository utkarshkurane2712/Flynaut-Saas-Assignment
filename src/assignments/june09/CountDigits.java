package assignments.june09;

import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input positive integer
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int count = 0;
            int temp = number;

            // Loop to count digits
            while (temp > 0) {
                temp = temp / 10;
                count++;
            }

            System.out.println("Number of digits in " + number + " is: " + count);
        }

        scanner.close();
    }
}
