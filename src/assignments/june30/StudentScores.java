package assignments.june30;

import java.util.Vector;

public class StudentScores {

    public static void main(String[] args) {
        // Create a Vector to store scores
        Vector<Integer> scores = new Vector<>();

        // Add 6 scores
        scores.add(85);
        scores.add(90);
        scores.add(78);
        scores.add(92);
        scores.add(88);
        scores.add(80);

        // Update the score at the third position (index 2)
        scores.set(2, 95); // Changes 78 to 95

        // Display all scores
        System.out.println("Updated Student Scores: " + scores);
    }
}
