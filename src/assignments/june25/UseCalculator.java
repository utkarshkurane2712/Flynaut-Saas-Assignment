package assignments.june25;

public class UseCalculator {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        // Perform calculations
        double result1 = calc.add(10, 5);
        double result2 = calc.subtract(10, 5);
        double result3 = calc.multiply(10, 5);
        double result4 = calc.divide(10, 5);    // Valid division
        double result5 = calc.divide(10, 0);    // Division by zero

        // Display results
        System.out.println("Addition: 10 + 5 = " + result1);
        System.out.println("Subtraction: 10 - 5 = " + result2);
        System.out.println("Multiplication: 10 * 5 = " + result3);
        System.out.println("Division: 10 / 5 = " + result4);
        System.out.println("Division: 10 / 0 = " + result5); // Will display NaN
    }
}
