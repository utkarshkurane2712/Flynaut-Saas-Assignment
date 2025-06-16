package assignments.june10;

import java.util.Scanner;

public class CircleCalculations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate area and circumference
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        // Print the results
        System.out.println("Area of the circle: " + area);
        System.out.println("Circumference of the circle: " + circumference);

        scanner.close();
    }
}
