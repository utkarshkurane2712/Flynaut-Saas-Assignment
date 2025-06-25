package assignments.june09;

import java.util.Scanner;

public class OddNaturalNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of terms
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        int sum = 0;
        int number = 1;

        System.out.println("The first " + n + " odd natural numbers are:");

        for (int i = 1; i <= n; i++) {
            System.out.println(number);
            sum += number;
            number += 2; // next odd number
        }

        System.out.println("Sum of the odd natural numbers = " + sum);

        scanner.close();
    }
}
