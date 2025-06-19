package assignments.june19;

public class Main {

    public static void main(String[] args) {

        Student s = new Student();
        Teacher t = new Teacher();

        s.name = "Utkarsh";
        s.age = 24;
        s.grade = "A";

        t.name = "Prasad";
        t.age = 28;
        t.subject = "Java Programming";


        System.out.println("================= Student Info =================");
        System.out.println("Name: "+s.name);
        System.out.println("Age: "+s.age);
        System.out.println("Grade: "+s.grade);

        System.out.println("=================== Teacher Info ==================");
        System.out.println("Name: "+t.name);
        System.out.println("Age: "+t.age);
        System.out.println("Subject: "+t.subject);


    }
}
