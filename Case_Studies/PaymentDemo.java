package Case_Studies;

// Abstract Class
abstract class Payment {
    private String transactionId;
    private double amount;

    public Payment(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public abstract double processPayment();
}

// Credit Card Class
class CreditCardPayment extends Payment {

    public CreditCardPayment(String transactionId, double amount) {
        super(transactionId, amount);
    }

    @Override
    public double processPayment() {
        return getAmount() * 1.02;
    }
}

// UPI Class
class UPIPayment extends Payment {
    private String upiId;

    public UPIPayment(String transactionId, double amount, String upiId) {
        super(transactionId, amount);
        this.upiId = upiId;
    }

    @Override
    public double processPayment() {
        if (upiId == null || !upiId.contains("@")) {
            System.out.println("Invalid UPI ID");
            return 0;
        }
        return getAmount();
    }
}

// Processor Class
class PaymentProcessor {
    public static double processAll(Payment[] payments) {
        double total = 0;
        for (Payment p : payments) {
            total += p.processPayment();
        }
        return total;
    }
}

public class PaymentDemo {
    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment("TXN1", 1000);
        Payment p2 = new UPIPayment("TXN2", 1000, "user@upi");

        System.out.println("Credit Card: " + p1.processPayment());
        System.out.println("UPI: " + p2.processPayment());

        Payment[] payments = {p1, p2};
        System.out.println("Total: " + PaymentProcessor.processAll(payments));
    }
}