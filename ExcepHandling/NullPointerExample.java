package ExcepHandling;

public class NullPointerExample {
    public static void main(String[] args) {
        // Test Case 1: Valid String
        String s1 = "Hello Java";
        try {
            System.out.println("Length of s1: " + getLength(s1));
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Test Case 2: Null String
        String s2 = null;
        try {
            System.out.println("Length of s2: " + getLength(s2));
        } catch (IllegalArgumentException e) {
            // This block will execute because s2 is null
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        }
    }

    /**
     * Checks if the string is null before accessing its length.
     * This avoids a raw NullPointerException by throwing a 
     * descriptive IllegalArgumentException instead.
     */
    public static int getLength(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Input string 's' cannot be null.");
        }
        return s.length();
    }
}