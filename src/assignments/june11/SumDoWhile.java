package assignments.june11;

public class SumDoWhile {

    public static void main(String[] args) {
        int i = 1;       // Starting number
        int sum = 0;     // Variable to store the sum

        // do-while loop ensures the block runs at least once
        do {
            sum += i;    // Add current value of i to sum
            i++;         // Increment i
        } while (i <= 5); // Continue while i is less than or equal to 5

        System.out.println("Sum of integers from 1 to 5 is: " + sum);
    }
}
