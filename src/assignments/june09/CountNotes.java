package assignments.june09;

import java.util.Scanner;

public class CountNotes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Standard Indian denominations
        int[] denominations = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();

        System.out.println("Note distribution:");

        for (int denom : denominations) {
            if (amount >= denom) {
                int count = amount / denom;
                System.out.println(denom + " x " + count + " = " + (denom * count));
                amount = amount % denom;
            }
        }

        scanner.close();
    }
}
