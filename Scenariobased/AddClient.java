package Scenariobased;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class AddClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);

            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            Scanner sc = new Scanner(System.in);

            // Input numbers
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            // Send numbers to server
            dos.writeInt(num1);
            dos.writeInt(num2);

            // Receive result
            int result = dis.readInt();

            System.out.println("Sum from server = " + result);

            // Close connections
            sc.close();
            dis.close();
            dos.close();
            socket.close();

        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}
