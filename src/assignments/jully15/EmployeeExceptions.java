package assignments.jully15;

public class EmployeeExceptions {

    // Invalid experience exception
    static class InvalidExperienceException extends Exception {
        public InvalidExperienceException(String message) {
            super(message);
        }
    }

    // Invalid rating exception
    static class InvalidRatingException extends Exception {
        public InvalidRatingException(String message) {
            super(message);
        }
    }

    // No bonus eligibility exception
    static class NoBonusEligibleException extends Exception {
        public NoBonusEligibleException(String message) {
            super(message);
        }
    }
}

