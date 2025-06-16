package assignments.june16;

public class UsePersonStudentAndTeacher {

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Utkarsh";
        student.age = 25;
        student.grade = 10;

        // Create and set values for Teacher
        Teacher teacher = new Teacher();
        teacher.name = "Mr.Prasad";
        teacher.age = 30;
        teacher.subject = "Java Programming";

        System.out.println("======================");
        System.out.println("Student Details:");
        student.displayInfo();

        System.out.println("======================");
        System.out.println("Teacher Details:");
        teacher.displayInfo();
    }
}
