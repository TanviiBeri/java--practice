package Inheritance.AbstractClassExample;

abstract class Shape {
    abstract void draw();

    void message() {
        System.out.println("This is Shape");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Shape s = new Shape() {
            void draw() {
                System.out.println("Drawing shape");
            }
        };

        s.draw();
        s.message();
    }
}
