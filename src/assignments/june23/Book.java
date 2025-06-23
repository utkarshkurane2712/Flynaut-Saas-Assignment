package assignments.june23;

public class Book {

    private String title;
    private int price;

    // Constructor using 'this' to resolve naming conflict
    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    // Method to set details using 'this'
    public void setDetails(String title, int price) {
        this.title = title;
        this.price = price;
    }

    // Method to display book details
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }

    // Main method to test the class
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", 500);
        System.out.println("Book 1:");
        book1.display();

        // Creating another book object and setting details using setDetails
        Book book2 = new Book("", 0); // default values
        book2.setDetails("Python Basics", 400);
        System.out.println("\nBook 2:");
        book2.display();
    }
}
