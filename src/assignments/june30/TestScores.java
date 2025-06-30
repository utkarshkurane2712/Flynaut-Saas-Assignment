package assignments.june30;

import java.util.Vector;

public class TestScores {

    public static void main(String[] args) {
        // Create a Vector to store test scores
        Vector<Integer> scores = new Vector<>();

        // Add 5 scores to the Vector
        scores.add(75);
        scores.add(82);
        scores.add(68);
        scores.add(90);
        scores.add(88);

        // Update the score at index 2 to a new value (e.g., 78)
        scores.set(2, 78); // Replaces 68 with 78

        // Print all scores to see the changes
        System.out.println("Updated Test Scores:");
        for (int score : scores) {
            System.out.println(score);
        }
    }
}
