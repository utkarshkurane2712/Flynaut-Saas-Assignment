package assignments.jully15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        sdf.setLenient(false);

        try {
            System.out.print("Enter appointment date (dd-MM-yyyy): ");
            String inputDate = scanner.nextLine();

            Date appointmentDate;
            try {
                appointmentDate = sdf.parse(inputDate);
            } catch (ParseException e) {
                throw new DateExceptions.InvalidDateFormatException("Invalid date format. Please use dd-MM-yyyy.");
            }

            Date today = new Date();
            // Strip time portion for accurate comparison
            String todayStr = sdf.format(today);
            today = sdf.parse(todayStr);

            if (appointmentDate.before(today)) {
                throw new DateExceptions.PastDateException("Appointment date cannot be in the past.");
            }

            System.out.println("Appointment date is valid: " + sdf.format(appointmentDate));

        } catch (DateExceptions.InvalidDateFormatException | DateExceptions.PastDateException | ParseException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Validation process complete.");
        }

        scanner.close();
    }
}
