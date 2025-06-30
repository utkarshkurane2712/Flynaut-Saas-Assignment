package assignments.june09;

public class SumNaturalNumbers {

    public static void main(String[] args) {
        int sum = 0;

        // Loop from 1 to 10
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }

        // Display the result
        System.out.println("Sum of the first 10 natural numbers is: " + sum);
    }
}
