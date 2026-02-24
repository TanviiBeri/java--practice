package ExcepHandling;

// Main class (public)
public class Excep {

    // Method that throws checked exception
    public static void validate(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }

        System.out.println("Valid age: " + age);
    }

    public static void main(String[] args) {

        try {
            validate(12);   // Change to 20 to test valid case
        } 
        catch (InvalidAgeException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}


// Custom Checked Exception (NOT public)
class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}