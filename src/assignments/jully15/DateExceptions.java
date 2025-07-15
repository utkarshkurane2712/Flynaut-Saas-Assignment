package assignments.jully15;

public class DateExceptions {

    // Invalid Date Format Exception
    static class InvalidDateFormatException extends Exception {
        public InvalidDateFormatException(String message) {
            super(message);
        }
    }

    // Past Date Exception
    static class PastDateException extends Exception {
        public PastDateException(String message) {
            super(message);
        }
    }
}
