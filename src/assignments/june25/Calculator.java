package assignments.june25;

public class Calculator {

    // Addition
    public double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    public double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    public double multiply(double a, double b) {
        return a * b;
    }

    // Division with exception handling
    public double divide(double a, double b) {
        try {
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero.");
            }
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Division Error: " + e.getMessage());
            return Double.NaN; // Return NaN to indicate an invalid result
        }
    }
}
