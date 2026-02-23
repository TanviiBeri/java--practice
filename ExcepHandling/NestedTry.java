package ExcepHandling;

public class NestedTry {
    public static void main(String[] args) {

        try {  // outer try block

            try {  // inner try block
                System.out.println("Inner try block started");
                int result = 10 / 0;  // ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Caught ArithmeticException in inner try block: " + e.getMessage());
            }

            String str = null;
            System.out.println(str.length());  // NullPointerException

        } catch (NullPointerException e) {  // outer catch
            System.out.println("Caught NullPointerException in outer try block: " + e.getMessage());
        } finally {  // outer finally
            System.out.println("Finally block of outer try executed");
        }

        System.out.println("Program continues after nested try-catch blocks");
    }
}