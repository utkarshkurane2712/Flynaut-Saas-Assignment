package assignments.Augest01;

import java.util.Hashtable;
import java.util.Scanner;

public class PhoneBook {

    public static void main(String[] args) {
        Hashtable<String, String> phoneBook = new Hashtable<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- PhoneBook Menu ---");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display All");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");
            choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1: // Add
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phone = scanner.nextLine();

                    if (name == null || phone == null || name.trim().isEmpty() || phone.trim().isEmpty()) {
                        System.out.println("Null or empty keys/values are not allowed.");
                    } else {
                        phoneBook.put(name, phone);
                        System.out.println("Contact added.");
                    }
                    break;

                case 2: // Search
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();
                    if (phoneBook.containsKey(searchName)) {
                        System.out.println("Phone Number: " + phoneBook.get(searchName));
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 3: // Delete
                    System.out.print("Enter name to delete: ");
                    String deleteName = scanner.nextLine();
                    if (phoneBook.remove(deleteName) != null) {
                        System.out.println("Contact deleted.");
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 4: // Display
                    System.out.println("All Contacts:");
                    for (String key : phoneBook.keySet()) {
                        System.out.println("Name: " + key + ", Phone: " + phoneBook.get(key));
                    }
                    break;

                case 5:
                    System.out.println("Exiting PhoneBook.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
