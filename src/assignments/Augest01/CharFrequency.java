package assignments.Augest01;

import java.util.HashMap;

public class CharFrequency {

    public static void main(String[] args) {
        String input = "JavaCollections";

        // Create a HashMap to store character frequencies
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Convert string to char array and count frequencies
        for (char c : input.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                // Increment count if character already exists
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                // Add new character with count 1
                charCountMap.put(c, 1);
            }
        }

        // Print the character frequencies
        System.out.println("Character Frequencies:");
        System.out.println(charCountMap);
    }
}
