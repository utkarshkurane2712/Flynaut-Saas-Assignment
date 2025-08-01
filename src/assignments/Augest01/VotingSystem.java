package assignments.Augest01;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VotingSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> voteMap = new HashMap<>();

        System.out.println("Enter votes (type 'end' to finish voting):");

        while (true) {
            System.out.print("Vote for: ");
            String vote = scanner.nextLine().trim();

            if (vote.equalsIgnoreCase("end")) {
                break;
            }

            if (vote.isEmpty()) {
                System.out.println("Invalid input. Try again.");
                continue;
            }

            voteMap.put(vote, voteMap.getOrDefault(vote, 0) + 1);
        }

        // Display all candidates and their vote counts
        System.out.println("\nVote Counts:");
        for (Map.Entry<String, Integer> entry : voteMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Find the winner(s)
        int maxVotes = Collections.max(voteMap.values());

        System.out.println("\nWinner(s):");
        for (Map.Entry<String, Integer> entry : voteMap.entrySet()) {
            if (entry.getValue() == maxVotes) {
                System.out.println(entry.getKey() + " with " + entry.getValue() + " votes.");
            }
        }

        scanner.close();
    }
}
