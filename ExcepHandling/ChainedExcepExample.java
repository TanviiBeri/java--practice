package ExcepHandling;

public class ChainedExcepExample {
    public static void main(String[] args) {
        try {
            int[] n = new int[5];
            int divisor = 0;

            for (int i = 0; i < n.length; i++) {
                // This triggers an ArithmeticException
                int res = n[i] / divisor; 
                System.out.println(res);
            }
        } catch (ArithmeticException e) {
            // We wrap the ArithmeticException inside a RuntimeException
            // Notice we pass 'e' as the second argument to "chain" it
            throw new RuntimeException("High-level error: Math failure in loop", e);
        }
    }
}