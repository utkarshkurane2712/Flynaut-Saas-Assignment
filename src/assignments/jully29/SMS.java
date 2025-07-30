package assignments.jully29;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SMS {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Student> studentMap=new HashMap<>();

        int choice;
        do {
            System.out.println("\n ==== Student Management System ==== ");
            System.out.println("1. Add Student.");
            System.out.println("2. Show All Student.");
            System.out.println("3. Find Student By RollNo.");
            System.out.println("4. Delete Student By RollNo. ");
            System.out.println("5. Exit.");
            System.out.println("Enter Your Choice :");
            choice=sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Enter Roll No : ");
                    int rollNo=sc.nextInt();
                    sc.nextLine();
                    if(studentMap.containsKey(rollNo)){
                        System.out.println("Student with this Roll No is Already exist !!");
                        break;
                    }

                    System.out.println("Enter Name: ");
                    String name=sc.nextLine();
                    System.out.println("Enter Branch: ");
                    String branch=sc.nextLine();

                    Student student=new Student(rollNo,name,branch);
                    studentMap.put(rollNo,student);
                    System.out.println("Student Added Successfully");
                    break;

                case 2:
                    if(studentMap.isEmpty()){
                        System.out.println("No Students record Found!!");
                    }else {

                        System.out.println("\n ---- All Students ----");
                        for(Map.Entry<Integer, Student> entry : studentMap.entrySet()){
                            System.out.println(entry.getValue());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter RollNo to Search :");
                    int searchRoll=sc.nextInt();
                    if(studentMap.containsKey(searchRoll)){
                        System.out.println("Student Found: "+studentMap.get(searchRoll));
                    }else {
                        System.out.println("Student With roll No "+searchRoll+ " Not Found.");
                    }
                    break;

                case 4:
                    System.out.println("Enter Roll No To Delete Student: ");
                    int deleteNo=sc.nextInt();
                    if(studentMap.containsKey(deleteNo)){
                        studentMap.remove(deleteNo);
                        System.out.println("Delete Student is Successfully.");
                    }else {
                        System.out.println("Student With Roll No "+deleteNo+ " is Not Found.");
                    }
                    break;
                case 5:
                    System.out.println("Exit the SMS system. God Bye!!!");
                    break;

                default:
                    System.out.println("Invalid Choice. Please Try Again.");
            }

        }while (choice !=5);

        sc.close();

    }
}
