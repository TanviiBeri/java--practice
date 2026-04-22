package Scenariobased;

import java.rmi.*;
import java.util.*;

public class client {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("a: ");
            int x = sc.nextInt();
            System.out.print("b: ");
            int y = sc.nextInt();

            addition obj = (addition) Naming.lookup("rmi://localhost/add");
            int r = obj.add(x, y);

            System.out.println("res = " + r);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}