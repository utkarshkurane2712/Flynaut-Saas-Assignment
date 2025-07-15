package assignments.jully15;

public class MarksExceptions {

    // Custom exception for invalid marks
    static class InvalidMarksException extends Exception {
        public InvalidMarksException(String message) {
            super(message);
        }
    }

    // Custom exception for failing result
    static class FailException extends Exception {
        public FailException(String message) {
            super(message);
        }
    }
}
