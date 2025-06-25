package assignments.june25;

public class BankAccount {

    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println("Deposited: $" + amount + " | New Balance: $" + balance);
    }

    // Withdraw method with exception handling
    public void withdraw(double amount) {
        try {
            if (amount <= 0) {
                throw new IllegalArgumentException("Withdrawal amount must be positive.");
            }
            if (amount > balance) {
                throw new ArithmeticException("Insufficient balance. Cannot withdraw $" + amount);
            }
            balance -= amount;
            System.out.println("Withdrawn: $" + amount + " | New Balance: $" + balance);
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println("Withdrawal Error: " + e.getMessage());
        }
    }

    // Display account details
    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + balance);
    }
}
