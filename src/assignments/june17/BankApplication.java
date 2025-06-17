package assignments.june17;

import java.util.Scanner;

public class BankApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 0.0;
        int choice;

        do {
            System.out.println("======= BANK MENU =======");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("=========================");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();

                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposit successful!");
                    } else {
                        System.out.println("Enter a positive amount.");
                    }
                    break;


                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();

                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrawal successful!");
                    } else {
                        System.out.println("Invalid amount or insufficient balance.");
                    }
                    break;


                case 3:
                    System.out.println("Current Balance: " + balance);
                    break;


                case 4:
                    System.out.println("Exiting...");
                    break;


                default:
                    System.out.println("Invalid choice.");

            }

            System.out.println(); // spacing

        } while (choice != 4);

    }

}
