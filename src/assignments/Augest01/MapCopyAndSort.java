package assignments.Augest01;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapCopyAndSort {

    // Method to copy entries from HashMap to TreeMap
    public static TreeMap<String, String> copyAndSortByKey(HashMap<String, String> sourceMap) {
        // TreeMap sorts entries by key automatically
        return new TreeMap<>(sourceMap);
    }

    public static void main(String[] args) {
        // Create and populate a HashMap
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("C", "Cat");
        hashMap.put("B", "Bat");
        hashMap.put("A", "Ant");

        // Print original HashMap (unsorted)
        System.out.println("Original HashMap (Unsorted):");
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Copy and sort using TreeMap
        TreeMap<String, String> sortedMap = copyAndSortByKey(hashMap);

        // Print sorted TreeMap
        System.out.println("\nCopied TreeMap (Sorted by Key):");
        for (Map.Entry<String, String> entry : sortedMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
