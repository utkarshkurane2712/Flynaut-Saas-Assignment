package assignments.Augest01;

import java.util.Hashtable;

public class LoginCredentials {

    public static void main(String[] args) {
        // Create a Hashtable to store username-password pairs
        Hashtable<String, String> loginTable = new Hashtable<>();

        // Add valid entries
        loginTable.put("Utkarsh", "pass123");
        loginTable.put("Prakash", "admin@123");

        // Try adding null key (will throw NullPointerException)
        try {
            loginTable.put(null, "nopassword");
        } catch (NullPointerException e) {
            System.out.println("Null key not allowed in Hashtable: " + e);
        }

        // Try adding null value (will throw NullPointerException)
        try {
            loginTable.put("guest", null);
        } catch (NullPointerException e) {
            System.out.println("Null value not allowed in Hashtable: " + e);
        }

        // Print the hashtable
        System.out.println("\nStored Login Credentials:");
        for (String username : loginTable.keySet()) {
            System.out.println("Username: " + username + ", Password: " + loginTable.get(username));
        }
    }
}
