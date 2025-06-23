package assignments.june23;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }


    public int add(int a, int b, int c) {
        return a + b + c;
    }


    public double add(double a, double b) {
        return a + b;
    }


    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Add two integers
        int sum1 = calc.add(5, 10);
        System.out.println("Sum of two integers: " + sum1);

        // Add three integers
        int sum2 = calc.add(3, 6, 9);
        System.out.println("Sum of three integers: " + sum2);

        // Add two double values
        double sum3 = calc.add(2.5, 3.7);
        System.out.println("Sum of two doubles: " + sum3);
    }
}
