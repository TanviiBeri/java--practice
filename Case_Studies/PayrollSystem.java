class Employee {
    protected String name;
    protected double baseSalary;
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public double calculateSalary() {
        return baseSalary + (baseSalary * 0.05);
    }
}

class Manager extends Employee {
    public Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }
    @Override
    public double calculateSalary() {
        return super.calculateSalary() + 2000.00;
    }
}

class Executive extends Manager {
    public Executive(String name, double baseSalary) {
        super(name, baseSalary);
    }
    @Override
    public double calculateSalary() {
        return super.calculateSalary() + (this.baseSalary * 0.10);
    }
}

public class PayrollSystem {
    public static void main(String[] args) {
        Executive exec = new Executive("Alice", 10000);
        System.out.printf("Total Salary : %.2f%n", exec.calculateSalary());
    }
}
