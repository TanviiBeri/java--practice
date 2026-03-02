package ExcepHandling;


class Parent{
    void display(){
        System.out.println("Parent display");
    }
}
class Child extends Parent{
    @Override
    void display(){
        throw new NullPointerException("Unchecked exception allowed");
    }
}

public class ExcepInh {
    public static void main(String[] args) {
        Parent p = new Child();
        try {
            p.display();
        } catch (NullPointerException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
    
}
