class Student {

    // Instance variable
    String name;

    // Constructor with parameter
    Student(String name) {
        // 'this.name' refers to the instance variable
        // 'name' refers to the constructor parameter
        // This resolves the name conflict
        this.name = name;
    }

    // Method to display student name
    void display() {
        // 'this' refers to the current object
        // It accesses the instance variable 'name'
        System.out.println("Name: " + this.name);
    }
}

// Main class (file name must be Thiskeyword.java)
public class Thiskeyword {

    // Main method - program execution starts here
    public static void main(String[] args) {

        // Creating an object of Student class
        Student s = new Student("Alice");

        // Calling display method using object reference
        s.display();
    }
}
