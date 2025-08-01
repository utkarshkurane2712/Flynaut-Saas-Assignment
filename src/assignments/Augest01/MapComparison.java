package assignments.Augest01;

import java.util.*;

public class MapComparison {

    public static void main(String[] args) {
        // Sample entries
        String[][] entries = {{"C", "Cat"}, {"B", "Bat"}, {"A", "Ant"}};

        // HashMap
        Map<String, String> hashMap = new HashMap<>();
        // LinkedHashMap
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        // TreeMap
        Map<String, String> treeMap = new TreeMap<>();
        // Hashtable
        Map<String, String> hashtable = new Hashtable<>();

        // Populate all maps with the same entries
        for (String[] entry : entries) {
            hashMap.put(entry[0], entry[1]);
            linkedHashMap.put(entry[0], entry[1]);
            treeMap.put(entry[0], entry[1]);
            hashtable.put(entry[0], entry[1]);
        }

        // Try inserting null key and null value
        System.out.println("\n--- Testing null key and value ---");
        try {
            hashMap.put(null, "NullKeyInHashMap");
            hashMap.put("NullValueKey", null);
        } catch (Exception e) {
            System.out.println("HashMap error: " + e);
        }

        try {
            linkedHashMap.put(null, "NullKeyInLinkedHashMap");
            linkedHashMap.put("NullValueKey", null);
        } catch (Exception e) {
            System.out.println("LinkedHashMap error: " + e);
        }

        try {
            treeMap.put(null, "NullKeyInTreeMap");
        } catch (Exception e) {
            System.out.println("TreeMap error: " + e);
        }

        try {
            hashtable.put(null, "NullKeyInHashtable");
        } catch (Exception e) {
            System.out.println("Hashtable null key error: " + e);
        }

        try {
            hashtable.put("NullValueKey", null);
        } catch (Exception e) {
            System.out.println("Hashtable null value error: " + e);
        }

        // Print map contents
        System.out.println("\n--- HashMap Output ---");
        System.out.println(hashMap);

        System.out.println("\n--- LinkedHashMap Output ---");
        System.out.println(linkedHashMap);

        System.out.println("\n--- TreeMap Output ---");
        System.out.println(treeMap);

        System.out.println("\n--- Hashtable Output ---");
        System.out.println(hashtable);
    }
}
