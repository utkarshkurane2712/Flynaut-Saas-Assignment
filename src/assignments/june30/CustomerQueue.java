package assignments.june30;

import java.util.LinkedList;

public class CustomerQueue {

    public static void main(String[] args) {
        // Create a LinkedList to simulate the queue
        LinkedList<String> customerQueue = new LinkedList<>();

        // Add 5 customers to the queue
        customerQueue.add("Alice");
        customerQueue.add("Bob");
        customerQueue.add("Charlie");
        customerQueue.add("Diana");
        customerQueue.add("Ethan");

        // Remove the first customer (the one at the front of the queue)
        customerQueue.removeFirst(); // Removes "Alice"

        // Add a new customer at the end of the queue
        customerQueue.addLast("Frank");

        // Display the final queue
        System.out.println("Current customer queue: " + customerQueue);
    }
}
