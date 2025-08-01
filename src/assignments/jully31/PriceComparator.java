package assignments.jully31;

import java.util.Comparator;

public class PriceComparator implements Comparator<Book2> {

    @Override
    public int compare(Book2 b1, Book2 b2) {
        return Integer.compare(b1.price, b2.price);
    }
}
