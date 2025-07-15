package assignments.jully15;

import java.util.Scanner;

public class ATMTransaction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 10000; // Assume initial balance is ₹10,000

        try {
            System.out.print("Enter withdrawal amount: ");
            int amount = scanner.nextInt();

            // Validate amount
            if (amount < 0 || amount % 100 != 0) {
                throw new ATMExceptions.InvalidAmountException("Amount must be positive and in multiples of 100.");
            }

            // Validate balance
            if (amount > balance) {
                throw new ATMExceptions.InsufficientFundsException("Insufficient funds in account.");
            }

            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: ₹" + balance);

        } catch (ATMExceptions.InvalidAmountException | ATMExceptions.InsufficientFundsException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Transaction complete.");
        }

        scanner.close();
    }
}
