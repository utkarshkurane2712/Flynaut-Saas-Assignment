package assignments.Augest01;

import java.util.HashMap;
import java.util.Map;

public class HighestSalaryFinder {

    public static void main(String[] args) {
        // Create a HashMap to store employee names and salaries
        HashMap<String, Double> employeeSalaries = new HashMap<>();

        // Add entries
        employeeSalaries.put("Utkarsh", 75000.0);
        employeeSalaries.put("Nihal", 82000.0);
        employeeSalaries.put("Prakash", 82000.0);
        employeeSalaries.put("Dipak", 78000.0);
        employeeSalaries.put("Anup", 69000.0);

        // Step 1: Find the highest salary
        double maxSalary = Double.MIN_VALUE;
        for (double salary : employeeSalaries.values()) {
            if (salary > maxSalary) {
                maxSalary = salary;
            }
        }

        // Step 2: Find and print employees with the highest salary
        System.out.println("Employee(s) with the highest salary of $" + maxSalary + ":");
        for (Map.Entry<String, Double> entry : employeeSalaries.entrySet()) {
            if (entry.getValue() == maxSalary) {
                System.out.println(entry.getKey());
            }
        }
    }
}
