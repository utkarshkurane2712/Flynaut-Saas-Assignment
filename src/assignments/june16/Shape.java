package assignments.june16;

public class Shape {

    double base;
    double height;

    // Overloaded method: calculates area of a circle
    double calculateArea(double radius) {
        return 3.1416 * radius * radius;
    }

    // Overloaded method: calculates area of a rectangle
    double calculateArea(double length, double width) {
        return length * width;
    }

    // Method to be overridden
    double calculateArea() {
        System.out.println("Shape area method (generic).");
        return 0;
    }
}
