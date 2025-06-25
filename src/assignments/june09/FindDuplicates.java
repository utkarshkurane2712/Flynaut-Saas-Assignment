package assignments.june09;

public class FindDuplicates {

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 4, 10, 2, 12};

        System.out.println("Duplicate elements in the array:");

        // Track which elements have already been printed
        boolean[] printed = new boolean[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            if (!printed[i]) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {
                        System.out.println(numbers[i]);
                        printed[j] = true; // Mark duplicate so it's not printed again
                        break;
                    }
                }
            }
        }
    }
}
