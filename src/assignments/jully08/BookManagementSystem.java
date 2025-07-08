package assignments.jully08;

import java.util.Scanner;

public class BookManagementSystem {

    public static void main(String[] args) {
        BookService service = new BookServiceImpl();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("====== Book Management System ======");
            System.out.println("1. Add Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Search Book by Title");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author Name: ");
                    String author = scanner.nextLine();
                    service.addBook(new Book(title, author));
                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    System.out.println("All Books:");
                    for (Book book : service.getAllBooks()) {
                        System.out.println(book);
                    }
                    break;

                case 3:
                    System.out.print("Enter Title to Search: ");
                    String searchTitle = scanner.nextLine();
                    Book foundBook = service.searchBookByTitle(searchTitle);
                    if (foundBook != null) {
                        System.out.println("Book Found: " + foundBook);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 4);

    }
}

