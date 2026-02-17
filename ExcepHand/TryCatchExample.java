package ExcepHand;

public class TryCatchExample {
    public static void main(String[] args){
        int num1 =10;
        int num2 = 0;

        try{

            int result = num1 / num2;
            System.out.println("result: "+ result);
        }catch(ArithmeticException e){
            System.out.println("error: cannot divide by zero!");
            System.out.println("Exception message: " + e.getMessage());
        }
        System.out.println("program continues after exception handling.");
    }
}
