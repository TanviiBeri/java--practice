package pract;

import java.util.Scanner;

class Employee {
    String name;
    int id;
    double salary;

    void getEmployeeDetails(Scanner sc) {
        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter ID: ");
        id = sc.nextInt();

        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }

    void displayEmpDetails() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Name   : " + name);
        System.out.println("ID     : " + id);
        System.out.println("Salary : " + salary);
    }
}

class Manager extends Employee {
    double bonus;

    void getManagerDetails(Scanner sc) {
        System.out.print("Enter Bonus: ");
        bonus = sc.nextDouble();
    }

    void calcTotalSalary() {
        double totalSalary = salary + bonus;
        System.out.println("Bonus        : " + bonus);
        System.out.println("Total Salary : " + totalSalary);
    }
}

public class empmanager_singlein {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Manager m = new Manager();

        m.getEmployeeDetails(sc);
        m.getManagerDetails(sc);

        m.displayEmpDetails();
        m.calcTotalSalary();

        sc.close();
    }
}
