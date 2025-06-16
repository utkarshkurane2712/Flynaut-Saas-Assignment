package assignments.june09;

import java.util.Scanner;

public class AverageCalculator {

    public double computeAverage(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        // Create an object
        AverageCalculator obj = new AverageCalculator();

        // Call the method using the object
        double avg = obj.computeAverage(num1, num2, num3);

        System.out.println("Average: " + avg);

    }
}
