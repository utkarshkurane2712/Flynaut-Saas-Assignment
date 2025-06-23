package assignments.june23;

public class Employee {

    private int id;
    private String name;
    private double salary;

    // Constructor with id and name
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
        this.salary = 0.0; // default salary
    }

    // Constructor with id, name, and salary
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    // Main method to test the constructors
    public static void main(String[] args) {
        // Using constructor with id and name
        Employee emp1 = new Employee(101, "Utkarsh");
        System.out.println("Employee 1:");
        emp1.display();

        // Using constructor with id, name, and salary
        Employee emp2 = new Employee(102, "Prakash", 50000.0);
        System.out.println("\nEmployee 2:");
        emp2.display();
    }
}
