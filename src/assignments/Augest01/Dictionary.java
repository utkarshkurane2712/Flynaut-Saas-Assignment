package assignments.Augest01;

import java.util.Map;
import java.util.TreeMap;

public class Dictionary {

    public static void main(String[] args) {
        // Create a TreeMap to store words and their meanings
        TreeMap<String, String> dictionary = new TreeMap<>();

        // Add word-meaning pairs
        dictionary.put("Apple", "A fruit that is sweet and crisp.");
        dictionary.put("Dog", "A domesticated animal known as man's best friend.");
        dictionary.put("Book", "A collection of written or printed pages.");
        dictionary.put("Cat", "A small domesticated carnivorous mammal.");
        dictionary.put("Elephant", "A large mammal with a trunk, native to Africa and Asia.");

        // Display all entries in alphabetical order of words (keys)
        System.out.println("Dictionary (Alphabetical Order):");
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
