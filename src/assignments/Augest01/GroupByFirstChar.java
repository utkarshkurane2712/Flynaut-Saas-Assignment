package assignments.Augest01;

import java.util.*;

public class GroupByFirstChar {

    public static void main(String[] args) {
        // Input list of strings
        List<String> words = Arrays.asList("apple", "banana", "apricot", "blueberry");

        // Create the HashMap for grouping
        HashMap<Character, List<String>> groupedMap = new HashMap<>();

        // Group words by first character
        for (String word : words) {
            if (word == null || word.isEmpty()) continue;

            char firstChar = word.charAt(0);

            // If the key doesn't exist, create a new list
            groupedMap.computeIfAbsent(firstChar, k -> new ArrayList<>()).add(word);
        }

        // Print the grouped map
        System.out.println("Grouped by first character:");
        for (Map.Entry<Character, List<String>> entry : groupedMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
