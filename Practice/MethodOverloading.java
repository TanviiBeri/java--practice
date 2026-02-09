package Practice;

 class calc{
    void add(int a, int b){
        System.out.println("sum is:" +(a+b));
    }
    void add(int a, int b, int c){
        System.out.println("sum of 3 is:" + (a+b+c));
    }
 }
public class MethodOverloading{
 public static void main(String[] args){
    calc obj = new calc();
    obj.add(2,3);
    obj.add(2,3,4);
 }
}