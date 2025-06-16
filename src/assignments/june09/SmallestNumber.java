package assignments.june09;

import java.util.Scanner;

public class SmallestNumber {
    public int findSmallest(int a, int b, int c) {
        int smallest = a;

        if (b < smallest) {
            smallest = b;
        }

        if (c < smallest) {
            smallest = c;
        }

        return smallest;
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


        SmallestNumber obj = new SmallestNumber();
        int smallest = obj.findSmallest(num1, num2, num3);

        System.out.println("Smallest number is: " + smallest);

    }
}