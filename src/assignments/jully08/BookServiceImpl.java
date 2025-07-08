package assignments.jully08;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService{

    private List<Book> bookList = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        bookList.add(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookList;
    }

    @Override
    public Book searchBookByTitle(String title) {
        for (Book book : bookList) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
}
