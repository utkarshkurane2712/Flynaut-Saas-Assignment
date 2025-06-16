package assignments.june09;

public class CountEvenOdd {
    public static void main(String[] args) {
        int[] numbers = {10, 21, 4, 45, 66, 93, 1};

        int even = 0;
        int odd = 0;

        // Use index-based loop
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        // Output
        System.out.println("Even numbers count: " + even);
        System.out.println("Odd numbers count: " + odd);
    }
}
