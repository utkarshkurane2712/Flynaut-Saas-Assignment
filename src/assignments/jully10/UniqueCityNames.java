package assignments.jully10;

import java.util.Scanner;
import java.util.TreeSet;

public class UniqueCityNames {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TreeSet to store unique city names in sorted order
        TreeSet<String> cityNames = new TreeSet<>();

        System.out.println("Enter city names (type 'exit' to finish):");

        while (true) {
            String city = scanner.nextLine().trim();

            // Exit condition
            if (city.equalsIgnoreCase("exit")) {
                break;
            }

            // Add city to the TreeSet
            cityNames.add(city);
        }

        // Display the sorted list of unique cities
        System.out.println("Unique City Names (Sorted):");
        for (String city : cityNames) {
            System.out.println(city);
        }

    }
}
