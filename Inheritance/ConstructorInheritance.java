package Inheritance;

    class Animal{
        Animal(){
            System.out.println("Animal constructor called");
        }
            void sound(){
                System.out.println("Animal makes sound");
            }

        }
    


class Dog extends Animal{
    Dog(){
        System.out.println("Dog constructor called");
    }
        void bark(){
            System.out.println("Dog barks");
        }
    }


public class ConstructorInheritance{
    public static void main(String[] args){
        Animal a = new Animal();
        Dog d = new Dog();
        d.sound();
        d.bark();
    }
}
