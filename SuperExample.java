class Parent{
    void display(){
        System.out.println("parent is called.");
    }
    void show(){
        System.out.println("hi this is the parent!!");
    }
}

class Child extends Parent{
    void display(){
        super.display();//calls IMMEDIATE class above
        System.out.println("child is called.");
    }
    void show(){
        super.show();
            System.out.println("hi this is the child!!");
        }
    }


public class SuperExample{
    public static void main(String[] args){
    Child c = new Child();
        c.display();
        c.show();
    }
}