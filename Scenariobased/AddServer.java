package Scenariobased;

import java.io.*;
import java.net.*;

public class AddServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Server is waiting for client...");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");

            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            // Receive numbers
            int num1 = dis.readInt();
            int num2 = dis.readInt();

            System.out.println("Received numbers: " + num1 + ", " + num2);

            // Add numbers
            int result = num1 + num2;

            // Send result back
            dos.writeInt(result);

            System.out.println("Result sent: " + result);

            // Close connections
            dis.close();
            dos.close();
            socket.close();
            serverSocket.close();

        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}
