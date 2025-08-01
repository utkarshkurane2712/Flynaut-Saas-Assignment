package assignments.Augest01;

import java.util.HashMap;
import java.util.Map;

public class StudentMap {

    public static void main(String[] args) {
        // Create a HashMap to store roll numbers and names
        HashMap<Integer, String> studentMap = new HashMap<>();

        // Add at least 5 entries
        studentMap.put(101, "Utkarsh");
        studentMap.put(102, "Vaishnavi");
        studentMap.put(103, "Dhanshree");
        studentMap.put(104, "Dipak");
        studentMap.put(105, "Anup");

        // Print all entries using entrySet
        System.out.println("Student Roll Numbers and Names:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Roll Number: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
