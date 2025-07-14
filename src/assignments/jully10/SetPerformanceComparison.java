package assignments.jully10;

import java.util.*;

public class SetPerformanceComparison {

    public static void main(String[] args) {
        int numberOfElements = 10_000;
        Random random = new Random();
        List<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < numberOfElements; i++) {
            randomNumbers.add(random.nextInt(20_000));
        }

        testSetPerformance(new HashSet<>(), randomNumbers, "HashSet");
        testSetPerformance(new LinkedHashSet<>(), randomNumbers, "LinkedHashSet");
        testSetPerformance(new TreeSet<>(), randomNumbers, "TreeSet");
    }

    private static void testSetPerformance(Set<Integer> set, List<Integer> data, String setType) {
        System.out.println("\n==== " + setType + " ====");

        // Insertion
        long insertionStart = System.nanoTime();
        set.addAll(data);
        long insertionEnd = System.nanoTime();
        System.out.println("Insertion Time: " + (insertionEnd - insertionStart) / 1_000_000.0 + " ms");

        // Search (check if 5000 is present)
        long searchStart = System.nanoTime();
        boolean found = set.contains(5000);
        long searchEnd = System.nanoTime();
        System.out.println("Search Time (contains 5000): " + (searchEnd - searchStart) + " ns | Found: " + found);

        // Deletion
        long deletionStart = System.nanoTime();
        set.remove(5000);
        long deletionEnd = System.nanoTime();
        System.out.println("Deletion Time: " + (deletionEnd - deletionStart) + " ns");
    }
}
