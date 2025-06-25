package assignments.june09;

public class ReverseArray {

    public static void main(String[] args) {
        // Original array
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.print("Original array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Reverse the array in-place
        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            // Swap elements at start and end
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            start++;
            end--;
        }

        // Display reversed array
        System.out.print("\nReversed array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
