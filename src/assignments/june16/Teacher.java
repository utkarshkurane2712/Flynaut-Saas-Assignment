package assignments.june16;

public class Teacher extends Person {

    String subject;

    void displayInfo() {
        super.displayInfo(); // Call Person's displayInfo
        System.out.println("Subject: " + subject);
    }
}
