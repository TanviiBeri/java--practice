package IO;

import java.util.Scanner; // Import Scanner class for user input

public class Inputs {
    public static void main(String[] args) {

        // Create Scanner object to read input from console
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Calculate sum
        int sum = num1 + num2;

        // Display result
        System.out.println("Addition is: " + sum);

        // Close the scanner to free resources
        sc.close();
    }
}
