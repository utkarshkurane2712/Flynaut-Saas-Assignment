package assignments.june23;

public class UseShapeCircleSqureAndTriangle {

    public static void main(String[] args) {

        Shape shape1 = new Circle();
        Shape shape2 = new Square();
        Shape shape3 = new Triangle();

        System.out.println("\nShape examples:");
        shape1.draw(); // Circle's draw
        shape2.draw(); // Square's draw
        shape3.draw(); // Triangle's draw
    }
}
