package assignments.june09;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number to display its multiplication table: ");
        int num = scanner.nextInt();

        System.out.println("Multiplication table of " + num + ":");

        // Loop from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        scanner.close();
    }
}
