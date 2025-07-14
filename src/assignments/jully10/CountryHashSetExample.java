package assignments.jully10;

import java.util.HashSet;

public class CountryHashSetExample {

    public static void main(String[] args) {
        // Create a HashSet to store country names
        HashSet<String> countries = new HashSet<>();

        // Add country names, including a duplicate
        countries.add("India");
        countries.add("USA");
        countries.add("Germany");
        countries.add("Australia");
        countries.add("India"); // Duplicate entry

        // Display the set
        System.out.println("Countries in the HashSet: " + countries);
    }
}
