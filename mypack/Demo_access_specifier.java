package mypack;

import otherpack.AddDemo;  // import the other package

public class Demo_access_specifier extends AddDemo {

    public static void main(String[] args) {
        Demo_access_specifier obj = new Demo_access_specifier();

        obj.i = 10;   // access protected member via inheritance
        obj.j = 20;

        System.out.println("Accessing protected members from subclass in another package:");
        obj.show();   // Calls protected method from parent class
    }
}