package ExcepHandling;

// 1. Define the Custom Unchecked Exception
class DivideByZeroException extends RuntimeException {
    public DivideByZeroException(String message) {
        super(message);
    }
}

public class UncheckedExcep {

    // 2. Method that throws the custom exception
    public static void divide(int a, int b) {
        if (b == 0) {
            // We manually throw the exception if the divisor is 0
            throw new DivideByZeroException("Error: Division by zero is not allowed.");
        }
        System.out.println("Result: " + (a / b));
    }

    public static void main(String[] args) {
        // 3. Handling the exception using try-catch
        try {
            System.out.println("Attempting to divide...");
            divide(10, 0); // This will trigger the exception
        } catch (DivideByZeroException e) {
            // This block executes because an exception was thrown
            System.err.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Process complete.");
        }
    }
}
