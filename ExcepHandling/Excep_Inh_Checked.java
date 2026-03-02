package ExcepHandling;

import java.io.IOException;
import java.io.FileNotFoundException;

// Parent class with checked exception
class Parent {
    void display() throws IOException {
        System.out.println("Parent reading file...");
    }
}

// Child class overriding parent method
class Child extends Parent {
    @Override
    void display() throws FileNotFoundException { // Subclass of IOException
        // Remove any NullPointerException or runtime exception
        throw new FileNotFoundException("File not found in Child");
    }
}

// Main class
public class Excep_Inh_Checked {
    public static void main(String[] args) {

        Parent p = new Child();  // Runtime polymorphism

        try {
            p.display();         // Calls Child's method
        } catch (IOException e) { // Handles checked exception
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}