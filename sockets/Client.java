package sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        Socket socket = new Socket("localhost",5000);

        try (BufferedReader userInput = new BufferedReader(new InputStreamReader(System))) {
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        try (BufferedReader in = new BufferedReader(new InputStreamReader(socket.get))) {
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        String msg;
        while (true) { 
            System.out.println("Enter Message : ");
        }}

    }}
}