package assignments.jully31;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseStudent2 {

    public static void main(String[] args) {


        List<Student2> studentList=new ArrayList<>();

        studentList.add(new Student2(1,"Utkarsh",34));
        studentList.add(new Student2(2,"Aman",45));
        studentList.add(new Student2(10,"Nihal",77));
        studentList.add(new Student2(14,"Abdul",66));

// Before Natural Sorting Order
        System.out.println("Before Sorting Order: ");
        for(Student2 st1: studentList){
            System.out.println(st1);
        }
// Sort Descending order By Marks
        System.out.println("\n Sorted Descending Order By Marks: ");
        Collections.sort(studentList,new MarkComparator());
        for(Student2 std:studentList) {
            System.out.println(std);
        }
    }
}
