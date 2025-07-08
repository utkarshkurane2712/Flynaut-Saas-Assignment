package assignments.jully08;

public class UseVehicleCarAndEBike {

    public static void main(String[] args) {

        // Car object
        Vehicle myCar = new Car();
        System.out.println("=== Car ===");
        myCar.start();
        System.out.println("Fuel Type: " + myCar.fuelType());
        myCar.stop();

        System.out.println();

        // Electric Bike object
        Vehicle myBike = new ElectricBike();
        System.out.println("=== Electric Bike ===");
        myBike.start();
        System.out.println("Fuel Type: " + myBike.fuelType());
        myBike.stop();
    }
}

