package assignments.jully15;

public class DeliverySlotException {

    static class DeliverySlotUnavailableException extends Exception{
        public DeliverySlotUnavailableException(String message){
            super(message);
        }
    }
}
