package Interface;


interface Animal{
    void show();
    void eat();
}

interface Bird{
    void display();
    void skill();
}

class Dog implements Animal, Bird{
    public void show(){
        System.out.println("This is a dog.");
    }
    public void eat(){
        System.out.println("A dog eats fish.");
    }
    public void display(){
        System.out.println("A dog cannot display.");
    }
    public void skill(){
        System.out.println("A dog cannot fly.");
    }
}

public class InterfaceBasic {
    public static void main(String[] args){
        Animal a = new Dog();
        Bird b = new Dog();
        a.show();
        a.eat();
        b.display();
        b.skill();

    }
}