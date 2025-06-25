package assignments.june09;

public class SegregateZerosAndOnes {

    public static void main(String[] args) {
        int[] array = {0, 1, 1, 0, 1, 0, 0, 1};

        int left = 0;
        int right = array.length - 1;

        // Two-pointer approach
        while (left < right) {
            // Move left forward if it's 0
            while (array[left] == 0 && left < right) {
                left++;
            }

            // Move right backward if it's 1
            while (array[right] == 1 && left < right) {
                right--;
            }

            // Swap when needed
            if (left < right) {
                array[left] = 0;
                array[right] = 1;
                left++;
                right--;
            }
        }

        // Print the result
        System.out.print("Array after segregation: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
