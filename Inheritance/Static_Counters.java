// Class to demonstrate static variable
package Inheritance;
class Counter {

    // Static variable belongs to the class, shared by all objects
    static int count = 0;

    // Constructor
    Counter() {
        count++; // Increment the static count whenever a new object is created
        System.out.println("Object created, current count: " + count);
    }
}

// Main class
public class Static_Counters {
    public static void main(String[] args) {

        // Create three objects without assigning them to variables
        new Counter(); // count = 1
        new Counter(); // count = 2
        new Counter(); // count = 3

        // Access static variable directly using class name
        System.out.println("Final Count: " + Counter.count);
    }
}
