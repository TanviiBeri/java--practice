package ExcepHandling;

public class Example {

    public static void fun() {
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("caught inside fun()");
        }
    }

    public static void main(String[] args) {
        fun();
    }
}
