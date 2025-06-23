package assignments.june23;

public class Car {

    private String model;
    private int year;

    // Default constructor
    public Car() {
        model = "Unknown";
        year = 0;
    }

    // Constructor with one parameter
    public Car(String model) {
        this.model = model;
        year = 0;
    }

    // Constructor with two parameters
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    public void display() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    // Main method to test constructor overloading
    public static void main(String[] args) {
        // Using default constructor
        Car car1 = new Car();
        System.out.println("Car 1:");
        car1.display();

        // Using one-parameter constructor
        Car car2 = new Car("Toyota");
        System.out.println("\nCar 2:");
        car2.display();

        // Using two-parameter constructor
        Car car3 = new Car("Honda", 2022);
        System.out.println("\nCar 3:");
        car3.display();
    }
}
