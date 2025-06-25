package assignments.june09;

public class AscendingSort {

    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 3};

        // Sorting using simple selection sort
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    // Swap elements
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        // Print sorted array
        System.out.println("Array in ascending order:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
