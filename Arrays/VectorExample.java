package Arrays;

import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {

        Vector<Integer> numbers = new Vector<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);

        System.out.println("Vector: " + numbers);

        numbers.remove(1);  // removes element at index 1

        System.out.println("After removal: " + numbers);

        System.out.println("Size: " + numbers.size());
        System.out.println("First element: " + numbers.get(0));
    }
}
