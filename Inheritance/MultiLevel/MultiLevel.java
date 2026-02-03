package Inheritance.MultiLevel;

class Shape{
    void showS(){
        System.out.println("This is a shape");
    }
}
class Triangle extends Shape{
    void showT(){
        System.out.println("This is a triangle");
    }
}
class RightAngledTriangle extends Triangle{
    void showR(){
        System.out.println("This is a right-angled triangle");
    }
}

public class MultiLevel{
    public static void main(String[] args){
        RightAngledTriangle r = new RightAngledTriangle();

        r.showS();
        r.showT();
        r.showR();
    }
}
