package Inheritance;

class Animal{
    void sound(){
        System.out.println("Animal makes sounds");
    }
}

class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Meow.");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("BOO!");
    }
}

public class AnimalOverriding{
    public static void main(String[] args){
        Animal a = new Cat();
        Animal d = new Dog();
        a.sound();
        d.sound();
    }
}