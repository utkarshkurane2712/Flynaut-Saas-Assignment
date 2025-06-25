package assignments.june25;

public class Book {

    private int bookId;
    private String title;
    private boolean isAvailable;

    // Constructor
    public Book(int bookId, String title) {
        this.bookId = bookId;
        this.title = title;
        this.isAvailable = true; // Initially, the book is available
    }

    // Method to rent the book
    public void rentBook() {
        try {
            if (!isAvailable) {
                throw new IllegalStateException("Book is currently unavailable.");
            }
            isAvailable = false;
            System.out.println("Book rented: " + title);
        } catch (IllegalStateException e) {
            System.out.println("Error renting \"" + title + "\": " + e.getMessage());
        }
    }

    // Method to return the book
    public void returnBook() {
        isAvailable = true;
        System.out.println("Book returned: " + title);
    }

    // Display book info
    public void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Rented"));
        System.out.println("--------------------------");
    }
}
