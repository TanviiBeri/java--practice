package Inheritance;

public class MethodOverriding {
    public static void main(String[] args) {
        BankAccount sa = new SavingsAccount();
        BankAccount ca = new CurrentAccount();
        System.out.println("Savings Interest Rate: " + sa.getInterestRate());
        System.out.println("Current Interest Rate: " + ca.getInterestRate());
    }

}
class BankAccount {
    double getInterestRate() {
        return 0.0; // Default interest rate
    }
}

// Child Class - Savings Account
class SavingsAccount extends BankAccount {
    @Override
    double getInterestRate() {
        return 4.5; // Savings interest rate
    }
}

// Child Class - Current Account
class CurrentAccount extends BankAccount {
    @Override
    double getInterestRate() {
        return 3.0; // Current account interest rate
    }
}