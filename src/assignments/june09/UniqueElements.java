package assignments.june09;

public class UniqueElements {

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5, 6, 6};

        System.out.println("Unique elements in the array:");
        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;

            // Check if this element appears more than once
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }

            // Print only if it's unique
            if (isUnique) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
