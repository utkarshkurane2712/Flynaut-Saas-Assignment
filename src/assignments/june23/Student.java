package assignments.june23;

public class Student {

    private String name;
    private int age;

    // Constructor to initialize name and age
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display student details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method to test the Student class
    public static void main(String[] args) {
        // Creating a Student object
        Student student1 = new Student("Utkarsh", 25);

        // Displaying student information
        student1.displayInfo();
    }
}
