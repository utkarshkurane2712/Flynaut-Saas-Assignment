package assignments.jully31;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseStudent {

    public static void main(String[] args) {
        List<Student> studentList=new ArrayList<>();

        studentList.add(new Student(11,"Utkarsh",85));
        studentList.add(new Student(9,"Vishaka",75));
        studentList.add(new Student(10,"Nihal",77));
        studentList.add(new Student(14,"Arbaz",66));
        studentList.add(new Student(12,"Vishal",88));
        studentList.add(new Student(13,"Krishna", 82));


        System.out.println("Sorted Order By Roll No:");
        //Sorted Order BY Student Roll No
        Collections.sort(studentList);
        for(Student std: studentList){
            System.out.println(std);
        }


        // Sort Descending order By Marks
        System.out.println("\n Sorted Descending Order By Marks: ");


        for(Student std:studentList) {
            System.out.println(std);
        }

    }
}
