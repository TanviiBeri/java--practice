package Inheritance.SingleInheritance;

class Animal{
    void eat(){
        System.out.println("Animal eats food");
    }
    void rest(){
        System.out.println("Animal sleeps");
    }
    
}

class Dog extends Animal{
    void bark(){
        System.out.println("dog barks");
    }
    void drink(){
        System.out.println("dog drinks water");
    }

}

public class Single_Inheritance{
public static void main(String[] args){
    Dog d = new Dog();
    d.eat();
    d.bark();
    d.rest();
    d.drink();
}
}