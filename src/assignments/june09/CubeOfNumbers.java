package assignments.june09;

import java.util.Scanner;

public class CubeOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a positive integer
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        System.out.println("Cubes of numbers from 1 to " + n + ":");

        // Loop to calculate and display cube
        for (int i = 1; i <= n; i++) {
            int cube = i * i * i;
            System.out.println("Number: " + i + " Cube: " + cube);
        }

        scanner.close();
    }
}
