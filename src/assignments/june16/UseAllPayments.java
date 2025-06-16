package assignments.june16;

public class UseAllPayments {
    public static void main(String[] args) {

        // Polymorphic reference of type Payment
        Payment payment;

        // Assign CreditCardPayment to payment reference
        payment = new CreditCardPayment();
        payment.pay();  // Calls CreditCardPayment's pay()

        // Assign DebitCardPayment to payment reference
        payment = new DebitCardPayment();
        payment.pay();  // Calls DebitCardPayment's pay()

        // Assign UPIPayment to payment reference
        payment = new UPIPayment();
        payment.pay();  // Calls UPIPayment's pay()
    }
}
