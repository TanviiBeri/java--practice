package Inheritance.AbstractClassExample;

abstract class Coffee{
    abstract void drink();
        void like(){
            System.out.println("I like coffee");
        }
    }


public class Abstract{
    public static void main(String[] args){
        Coffee c = new Coffee(){
            void drink(){
                System.out.println("Coffee is a liquid.");
            }

    };
    c.drink();
    c.like();

}
}
