package assignments.june16;

public class UseMathOperations {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        int result1 = math.multiply(4, 5);
        System.out.println("Multiplying two numbers: = " + result1);

        int result2 = math.multiply(2, 3, 4);
        System.out.println("Multiplying three numbers: = " + result2);
    }
}
