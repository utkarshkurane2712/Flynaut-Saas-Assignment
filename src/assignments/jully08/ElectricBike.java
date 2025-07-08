package assignments.jully08;

public class ElectricBike implements Vehicle{

    @Override
    public void start() {
        System.out.println("Electric Bike is started.");
    }

    @Override
    public void stop() {
        System.out.println("Electric Bike is stopped.");
    }

    @Override
    public String fuelType() {
        return "Electric";
    }
}
