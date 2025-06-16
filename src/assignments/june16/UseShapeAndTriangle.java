package assignments.june16;

public class UseShapeAndTriangle {

    public static void main(String[] args) {
        Shape shape = new Shape();

        // Method overloading examples
        double circleArea = shape.calculateArea(5.0);              // Circle
        double rectangleArea = shape.calculateArea(4.0, 6.0);     // Rectangle

        System.out.println("Circle Area: " + circleArea);
        System.out.println("Rectangle Area: " + rectangleArea);

        // Method overriding example
        Triangle triangle = new Triangle();
        triangle.base = 4.0;
        triangle.height = 5.0;
        double triangleArea = triangle.calculateArea();           // Triangle's overridden method

        System.out.println("Triangle Area: " + triangleArea);
    }
}
