package assignments.june25;

public class UseBook {

    public static void main(String[] args) {

        // Create book objects
        Book b1 = new Book(201, "The Great Gatsby");
        Book b2 = new Book(202, "1984");
        Book b3 = new Book(203, "To Kill a Mockingbird");

        // Rent and return books
        b1.rentBook(); // Success
        b1.rentBook(); // Already rented - should trigger exception

        b2.rentBook(); // Success
        b2.returnBook(); // Return it
        b2.rentBook(); // Rent again - success

        b3.returnBook(); // Returning already

        // Display final status of books
        System.out.println("\nLibrary Inventory:");
        b1.displayBook();
        b2.displayBook();
        b3.displayBook();
    }
}
