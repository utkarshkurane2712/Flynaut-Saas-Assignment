package assignments.june9;

import java.util.Scanner;

public class EvenCheck {

    void isEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Create object and call method
        EvenCheck obj = new EvenCheck();
        obj.isEven(num);

    }
}
