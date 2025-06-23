package assignments.june23;

public class BankAccount {

    private double balance;

    public BankAccount() {
        balance = 0.0;
    }


    public void deposit(double amount) {
        balance += amount;
        System.out.println("Cash deposited: ₹" + amount);
    }


    public void deposit(double amount, String chequeNumber) {
        balance += amount;
        System.out.println("Deposited via cheque:");
        System.out.println("Cheque Number: " + chequeNumber);
        System.out.println("Amount: ₹" + amount);
    }


    public void deposit(double amount, String senderAccount, boolean isOnline) {
        if (isOnline) {
            balance += amount;
            System.out.println("Deposited via online transfer:");
            System.out.println("Sender Account: " + senderAccount);
            System.out.println("Amount: ₹" + amount);
        } else {
            System.out.println("Invalid transaction: Not marked as online.");
        }
    }


    public void displayBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }


    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // Cash deposit
        account.deposit(1000);

        // Cheque deposit
        account.deposit(2500, "CHQ123456");

        // Online transfer deposit
        account.deposit(5000, "ACC998877", true);

        // Display current balance
        account.displayBalance();
    }
}
