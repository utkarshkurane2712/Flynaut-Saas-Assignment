package assignments.june16;

public class Car extends Vehicle{

    String brand;
    String model;

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("The Brand of the car is "+brand+" and the model is "+model);
    }
}
