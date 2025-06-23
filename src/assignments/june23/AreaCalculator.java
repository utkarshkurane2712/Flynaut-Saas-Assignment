package assignments.june23;

public class AreaCalculator {

    public double calculateArea(int side) {
        return side * side;
    }

    public double calculateArea(int length, int breadth) {
        return length * breadth;
    }

    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();

        // Area of square
        double squareArea = calc.calculateArea(5);
        System.out.println("Area of square: " + squareArea);

        // Area of rectangle
        double rectangleArea = calc.calculateArea(4, 6);
        System.out.println("Area of rectangle: " + rectangleArea);

        // Area of circle
        double circleArea = calc.calculateArea(3.5);
        System.out.println("Area of circle: " + circleArea);
    }
}
