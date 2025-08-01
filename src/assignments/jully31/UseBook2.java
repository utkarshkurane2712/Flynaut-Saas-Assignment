package assignments.jully31;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseBook2 {

    public static void main(String[] args) {

        List<Book2> bookList=new ArrayList<>();
        bookList.add(new Book2("Java","James",1200));
        bookList.add(new Book2("c++","Bjarne",800));
        bookList.add(new Book2("Harray Potter","Rowling",1400));
        bookList.add(new Book2("Mahabharata","Vyasa",2000));
        bookList.add(new Book2("Geetanjali","Rabindranath Tagore ",750));

        // Before Sorting List
        System.out.println("Before Sorting order Book List");
        for (Book2 b:bookList){
            System.out.println(b);

        }

        // After sorting by price Book List
        System.out.println("\n After Sorting By Price Book List :");

        Collections.sort(bookList,new PriceComparator());

        for (Book2 b2: bookList){
            System.out.println(b2);
        }

    }
}
