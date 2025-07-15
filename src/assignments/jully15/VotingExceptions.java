package assignments.jully15;

public class VotingExceptions {

    static class UnderageVoterException extends Exception{
        public UnderageVoterException(String msg){
            super(msg);
        }
    }

    static class IneligibleNationalityException extends Exception {
        public IneligibleNationalityException(String message) {
            super(message);
        }
    }
}
