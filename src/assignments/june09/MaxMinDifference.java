package assignments.june09;

public class MaxMinDifference {

    public static void main(String[] args) {
        int[] numbers = {10, 25, 5, 42, 17, 89, 3};

        int max = numbers[0];
        int min = numbers[0];

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        int difference = max - min;

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
        System.out.println("Difference between max and min: " + difference);
    }
}
