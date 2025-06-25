package assignments.june09;

public class CommonElements {

    public static void main(String[] args) {
        // Define two arrays
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {4, 5, 6, 7, 8};

        System.out.print("Common elements: ");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.print(array1[i] + " ");
                    break; // Avoid duplicates
                }
            }
        }
    }
}
