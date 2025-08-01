package assignments.Augest01;

import java.util.Map;
import java.util.TreeMap;

public class EmployeeDirectory {

    public static void main(String[] args) {
        // Create a TreeMap to store employee IDs and names
        TreeMap<Integer, String> employeeMap = new TreeMap<>();

        // Add entries (ID -> Name)
        employeeMap.put(103, "Utkarsh");
        employeeMap.put(101, "Arbaz");
        employeeMap.put(105, "Nihal");
        employeeMap.put(102, "Akash");
        employeeMap.put(104, "Amol");

        // Print all entries (sorted by ID)
        System.out.println("Employee Directory (sorted by ID):");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Retrieve and print the employee with the lowest ID
        Map.Entry<Integer, String> lowest = employeeMap.firstEntry();
        System.out.println("\nEmployee with Lowest ID: ID = " + lowest.getKey() + ", Name = " + lowest.getValue());

        // Retrieve and print the employee with the highest ID
        Map.Entry<Integer, String> highest = employeeMap.lastEntry();
        System.out.println("Employee with Highest ID: ID = " + highest.getKey() + ", Name = " + highest.getValue());
    }
}
