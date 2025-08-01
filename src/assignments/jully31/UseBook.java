package assignments.jully31;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseBook {

    public static void main(String[] args) {

        List<Book> bookList=new ArrayList<>();

        bookList.add(new Book("Java","James",1200));
        bookList.add(new Book("c++","Bjarne",800));
        bookList.add(new Book("Harray Potter","Rowling",1400));
        bookList.add(new Book("Mahabharata","Vyasa",2000));
        bookList.add(new Book("Geetanjali","Rabindranath Tagore ",750));

        // Before Sorting Order
        System.out.println("Before Sorting by Author :");

        for (Book b:bookList){
            System.out.println(b);
        }

        // After Sorted Order By Author Name
        System.out.println("\n After Sorting By Author Name :");

        Collections.sort(bookList);

        for (Book b1:bookList){
            System.out.println(b1);
        }
    }
}
