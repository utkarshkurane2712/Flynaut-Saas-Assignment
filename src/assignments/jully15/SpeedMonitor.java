package assignments.jully15;

import java.util.Scanner;

public class SpeedMonitor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your current vehicle speed (km/h): ");
            int speed = scanner.nextInt();

            if (speed > 120) {
                throw new SpeedExceptions.OverSpeedException("Warning: You are overspeeding! Slow down.");
            }

            if (speed < 0) {
                throw new SpeedExceptions.InvalidSpeedException("Warning: Speed cannot be negative.");
            }

            System.out.println("Your speed is within the safe limit.");

        } catch (SpeedExceptions.OverSpeedException | SpeedExceptions.InvalidSpeedException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Drive Safe!");
        }

        scanner.close();
    }
}
