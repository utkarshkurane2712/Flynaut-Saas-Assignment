package assignments.june09;

public class RotateArrayClockwise {

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        System.out.println("Original array:");
        printArray(array);

        // Perform rotation
        rotateClockwiseByOne(array);

        System.out.println("Array after rotating clockwise by one:");
        printArray(array);
    }

    // Method to rotate the array clockwise by one
    public static void rotateClockwiseByOne(int[] arr) {
        int n = arr.length;
        if (n == 0) return;

        int last = arr[n - 1];

        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;
    }

    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
