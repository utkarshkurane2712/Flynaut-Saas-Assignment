package assignments.Augest01;

import java.util.LinkedHashMap;
import java.util.Map;

public class UserRoles {

    public static void main(String[] args) {
        // Create a LinkedHashMap to maintain insertion order
        LinkedHashMap<String, String> userRoles = new LinkedHashMap<>();

        // Add entries (role, user)
        userRoles.put("admin", "Utkarsh");
        userRoles.put("editor", "Nihal");
        userRoles.put("viewer", "Akash");
        userRoles.put("moderator", "Amol");

        // Print entries in insertion order
        System.out.println("User Roles (in insertion order):");
        for (Map.Entry<String, String> entry : userRoles.entrySet()) {
            System.out.println("Role: " + entry.getKey() + ", User: " + entry.getValue());
        }
    }
}
