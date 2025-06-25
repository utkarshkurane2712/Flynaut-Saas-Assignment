package assignments.june09;

import java.util.Scanner;

public class InsertElementInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Original array
        int[] original = {10, 20, 30, 40, 50};

        // Input element to insert
        System.out.print("Enter the element to insert: ");
        int element = sc.nextInt();

        // Input position (0-based index)
        System.out.print("Enter the position (0 to " + original.length + "): ");
        int position = sc.nextInt();

        if (position < 0 || position > original.length) {
            System.out.println("Invalid position!");
        } else {
            // New array with one extra space
            int[] newArray = new int[original.length + 1];

            for (int i = 0, j = 0; i < newArray.length; i++) {
                if (i == position) {
                    newArray[i] = element;
                } else {
                    newArray[i] = original[j];
                    j++;
                }
            }

            // Display the new array
            System.out.print("Array after insertion: ");
            for (int num : newArray) {
                System.out.print(num + " ");
            }
        }

        sc.close();
    }
}
