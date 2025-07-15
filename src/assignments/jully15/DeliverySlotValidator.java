package assignments.jully15;

import java.util.Scanner;

public class DeliverySlotValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter delivery time slot (in hours, 0 to 23): ");
            int deliveryHour = scanner.nextInt();

            if (deliveryHour < 9 || deliveryHour > 21) {
                throw new DeliverySlotException.DeliverySlotUnavailableException("Delivery not available at this time. Choose between 9 AM and 9 PM.");
            }

            System.out.println("Delivery slot booked successfully for " + deliveryHour + ":00 hours.");

        } catch (DeliverySlotException.DeliverySlotUnavailableException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Delivery slot validation complete.");
        }

        scanner.close();
    }
}
