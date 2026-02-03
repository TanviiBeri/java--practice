package Inheritance.SuperExample;

class Parent {
    Parent() {
        System.out.println("parent constructor called.");
    }
}

class Child extends Parent {
    Child() {
        super();  // calls Parent's constructor
        System.out.println("child constructor called.");
    }
}

public class SuperExampleConstructor {
    public static void main(String[] args) {
      new Child(); // creates Child object
    }
}
