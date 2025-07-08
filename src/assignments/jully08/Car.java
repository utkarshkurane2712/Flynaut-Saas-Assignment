package assignments.jully08;

public class Car implements Vehicle{

    @Override
    public void start() {
        System.out.println("Car is started.");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopped.");
    }

    @Override
    public String fuelType() {
        return "Petrol";
    }
}
