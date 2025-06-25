package assignments.june09;

import java.util.Scanner;

public class FindIndex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define the array
        int[] numbers = {10, 20, 30, 40, 50, 60};

        // Input the element to search
        System.out.print("Enter the element to find: ");
        int target = sc.nextInt();

        // Search for the element
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;
                break;
            }
        }

        // Display result
        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

        sc.close();
    }
}
