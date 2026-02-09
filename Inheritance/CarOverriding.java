package Inheritance;

class Car{
    void vroom(){
        System.out.println("McQueen says kachow.");
    }
}

class Ferrari extends Car{
    @Override
    void vroom(){
        System.out.println("Nice driver.");
    }
}

public class CarOverriding {
    public static void main(String[] args){
        Car c = new Car();
        c.vroom();

    }
}
