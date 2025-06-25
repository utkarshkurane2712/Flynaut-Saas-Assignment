package assignments.june25;

public class Student {

    private int studentId;
    private String studentName;
    private int studentAge;

    public Student(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
    }

    // method to set the age
    public void setAge(int studentAge){
        if (studentAge < 5 || studentAge > 100) {
            throw new IllegalArgumentException("Age must be between 5 and 100.");
        }
        this.studentAge = studentAge;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Age: " + studentAge);
    }
}
