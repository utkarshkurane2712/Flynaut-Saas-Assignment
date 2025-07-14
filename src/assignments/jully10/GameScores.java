package assignments.jully10;

import java.util.TreeSet;

public class GameScores {

    public static void main(String[] args) {
        // Create a TreeSet to store game scores
        TreeSet<Integer> scores = new TreeSet<>();

        // Insert unsorted and duplicate values
        scores.add(45);
        scores.add(89);
        scores.add(23);
        scores.add(67);
        scores.add(45); // Duplicate
        scores.add(12);

        // Display the sorted set
        System.out.println("Game Scores in TreeSet (Sorted): " + scores);
    }
}
