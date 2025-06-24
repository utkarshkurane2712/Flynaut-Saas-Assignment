package assignments.june23;

public class BankAct {

    private String accountNumber;
    private double balance;

    // Constructor to initialize account number and balance
    public BankAct(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money if sufficient funds are available
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    // Method to display account details
    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAct myAccount = new BankAct("123456789", 1000.0);

        // Display initial state
        myAccount.display();

        // Perform deposit
        myAccount.deposit(500.0);

        // Perform withdrawal
        myAccount.withdraw(300.0);

        // Try to withdraw more than the balance
        myAccount.withdraw(1500.0);

        // Display final state
        myAccount.display();
    }
}
