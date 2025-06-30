package assignments.june30;

import java.util.LinkedList;

public class MeetingAgenda {

    public static void main(String[] args) {
        // Create a LinkedList to hold meeting topics
        LinkedList<String> topics = new LinkedList<>();

        // Add 4 topics to the list
        topics.add("Project Updates");
        topics.add("Budget Planning");
        topics.add("Team Performance");
        topics.add("Client Feedback");

        // Add a new topic at the end
        topics.add("Upcoming Deadlines");

        // Remove the topic at the second position (index 1)
        topics.remove(1); // Removes "Budget Planning"

        // Display the current agenda topics
        System.out.println("Current Meeting Agenda:");
        for (String topic : topics) {
            System.out.println("- " + topic);
        }
    }
}
