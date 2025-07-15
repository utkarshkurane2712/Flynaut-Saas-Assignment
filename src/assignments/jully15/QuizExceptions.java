package assignments.jully15;

public class QuizExceptions {

    // Exception for incomplete answers
    static class IncompleteAnswerException extends Exception {
        public IncompleteAnswerException(String message) {
            super(message);
        }
    }
}
