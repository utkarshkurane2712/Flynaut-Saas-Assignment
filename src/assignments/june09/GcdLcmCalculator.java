package assignments.june09;

import java.util.Scanner;

public class GcdLcmCalculator {

    int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to calculate LCM
    int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);  // LCM formula using GCD
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Create object and call methods
        GcdLcmCalculator obj = new GcdLcmCalculator();

        int gcd = obj.findGCD(num1, num2);
        int lcm = obj.findLCM(num1, num2);

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);

    }
}
