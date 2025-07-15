package assignments.jully15;

public class SpeedExceptions {

    // Exception for speed > 120
    static class OverSpeedException extends Exception {
        public OverSpeedException(String message) {
            super(message);
        }
    }

    // Exception for speed < 0
    static class InvalidSpeedException extends Exception {
        public InvalidSpeedException(String message) {
            super(message);
        }
    }
}
