package assignments.jully10;

import java.util.*;

public class StudentManagementSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Set type to store students:");
        System.out.println("1. HashSet");
        System.out.println("2. LinkedHashSet");
        System.out.println("3. TreeSet (Will throw Exception)");
        int choice = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        Set<Student> students = null;

        switch (choice) {
            case 1:
                students = new HashSet<>();
                break;
            case 2:
                students = new LinkedHashSet<>();
                break;
            case 3:
                students = new TreeSet<>(); // Will cause exception as Student is not Comparable
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.print("\nHow many students do you want to enter? ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter details for Student " + i);
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Percentage: ");
            double percentage = sc.nextDouble();
            sc.nextLine(); // consume newline
            try {
                students.add(new Student(id, name, percentage));
            } catch (ClassCastException e) {
                System.out.println("\nTreeSet cannot store elements without Comparable or Comparator.");
                e.printStackTrace();
                return;
            }
        }

        System.out.println("\n----- Student Details -----");
        for (Student s : students) {
            s.displayInfo();
        }

        sc.close();
    }

}
