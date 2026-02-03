package Inheritance;
class Account {
    int balance = 1000;

    void display() {
        System.out.println("Account balance: " + balance);
    }
}

class CurrentAccount extends Account {
    void displayTotal(int interest) {
        System.out.println("Interest is: " + interest);
    }
}

class SavingsAccount extends Account {
    void displayS(int savings) {
        System.out.println("Savings is: " + savings);
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        CurrentAccount c = new CurrentAccount();

        s.display();
        s.displayS(500);

        c.display();
        c.displayTotal(200);
    }
}
