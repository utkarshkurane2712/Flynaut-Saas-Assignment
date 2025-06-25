package assignments.june09;

import java.util.Scanner;

public class SearchElementInArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example array
        int[] array = {10, 20, 30, 40, 50};

        // Ask user for the key to search
        System.out.print("Enter the element to search: ");
        int key = scanner.nextInt();

        boolean found = false;

        // Linear search
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                System.out.println("Element " + key + " found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element " + key + " not found in the array.");
        }

        scanner.close();
    }

}
