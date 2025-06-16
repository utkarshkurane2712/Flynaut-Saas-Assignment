package assignments.june16;

public class Student extends Person{

    int grade;

    void displayInfo() {
        super.displayInfo(); // Call Person's displayInfo
        System.out.println("Grade: " + grade);
    }
}
