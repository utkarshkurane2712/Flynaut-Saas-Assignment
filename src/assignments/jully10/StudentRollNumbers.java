package assignments.jully10;

import java.util.LinkedHashSet;

public class StudentRollNumbers {

    public static void main(String[] args) {
        // Create a LinkedHashSet to store student roll numbers
        LinkedHashSet<Integer> rollNumbers = new LinkedHashSet<>();

        // Insert roll numbers in random order with some duplicates
        rollNumbers.add(105);
        rollNumbers.add(101);
        rollNumbers.add(103);
        rollNumbers.add(102);
        rollNumbers.add(101); // Duplicate
        rollNumbers.add(104);
        rollNumbers.add(103); // Duplicate

        // Display the set
        System.out.println("Student Roll Numbers in LinkedHashSet: " + rollNumbers);
    }
}
