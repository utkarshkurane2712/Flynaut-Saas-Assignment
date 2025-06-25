package assignments.june09;

import java.util.Scanner;

public class ContainsValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define an array
        int[] numbers = {5, 10, 15, 20, 25, 30};

        // Input the value to search
        System.out.print("Enter a value to check in the array: ");
        int target = sc.nextInt();

        // Flag to track if value is found
        boolean found = false;

        // Check if the array contains the target value
        for (int num : numbers) {
            if (num == target) {
                found = true;
                break;
            }
        }

        // Display result
        if (found) {
            System.out.println("The array contains the value: " + target);
        } else {
            System.out.println("The array does not contain the value: " + target);
        }

        sc.close();
    }
}
