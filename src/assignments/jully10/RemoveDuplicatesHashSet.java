package assignments.jully10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesHashSet {

    public static void main(String[] args) {
        // List of employee names with duplicates
        List<String> employeeNames = Arrays.asList(
                "Alice", "Bob", "Charlie", "Alice", "Eve", "Bob"
        );

        // Remove duplicates using HashSet
        Set<String> uniqueNames = new HashSet<>(employeeNames);

        // Display results
        System.out.println("Unique Employee Names (HashSet, no order guaranteed):");
        System.out.println(uniqueNames);
    }
}
