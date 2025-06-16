package assignments.june09;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter 2nd Number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter 3rd Number: ");
        int num3 = sc.nextInt();

        System.out.print("Enter 4th Number: ");
        int num4 = sc.nextInt();

        System.out.print("Enter 5th Number: ");
        int num5 = sc.nextInt();

        int average = (num1 + num2 + num3 + num4 + num5) /5;

        System.out.print("The Average of this 5 Numbers is "+average);
    }
}
