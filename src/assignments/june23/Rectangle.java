package assignments.june23;

public class Rectangle {

    private double length;
    private double breadth;

    // Default constructor
    public Rectangle() {
        length = 1.0;
        breadth = 1.0;
    }

    // Parameterized constructor
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void display() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
    }


    public static void main(String[] args) {
        Rectangle defaultRectangle = new Rectangle();
        System.out.println("Default Rectangle:");
        defaultRectangle.display();

        Rectangle customRectangle = new Rectangle(5.5, 3.2);
        System.out.println("\nCustom Rectangle:");
        customRectangle.display();
    }
}
