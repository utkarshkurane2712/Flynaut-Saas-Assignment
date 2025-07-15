package assignments.jully15;

public class ProductExceptions {

    // Exception for invalid discount percentage
    static class InvalidDiscountException extends Exception {
        public InvalidDiscountException(String message) {
            super(message);
        }
    }

    // Exception for invalid product price
    static class InvalidPriceException extends Exception {
        public InvalidPriceException(String message) {
            super(message);
        }
    }
}
