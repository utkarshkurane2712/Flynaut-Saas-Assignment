package assignments.june23;

public class UseVehicleCar1AndBike {

    public static void main(String[] args) {
        Vehicle vehicle1 = new Car1();
        Vehicle vehicle2 = new Bike();

        System.out.println("Vehicle examples:");
        vehicle1.move(); // Car's move
        vehicle2.move(); // Bike's move
    }
}
