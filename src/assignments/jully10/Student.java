package assignments.jully10;

public class Student implements PersonInfo{

    int id;
    String name;
    double percentage;

    // Constructor
    public Student(int id, String name, double percentage) {
        this.id = id;
        this.name = name;
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Percentage: " + percentage;
    }

    @Override
    public void displayInfo() {
        System.out.println(this);
    }


}
