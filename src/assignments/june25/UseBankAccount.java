package assignments.june25;

public class UseBankAccount {

    public static void main(String[] args) {

        BankAccount account = new BankAccount("ACC123456");

        // Perform deposit operations
        account.deposit(1000);
        System.out.println("============================");
        account.deposit(-200); // Invalid deposit
        System.out.println("============================");


        // Perform withdrawal operations
        account.withdraw(200);
        System.out.println("============================");
        account.withdraw(1000); // Overdraw attempt
        System.out.println("============================");
        account.withdraw(-50);  // Invalid withdrawal
        System.out.println("============================");


        // Display final account state
        System.out.println("\nFinal Account Details:");
        account.displayAccount();
    }
}
