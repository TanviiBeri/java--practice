package ExcepHandling;

public class MultipleExceptionSingleCatch {
    public static void main(String[] args){
        try{
            //intentionally causing multiple exceptions
            String str = "123a";
            int num = Integer.parseInt(str); //
            int result =10/0; //
        }catch (NumberFormatException | ArithmeticException e){
            //
            System.out.println("Error:" + e.getClass().getSimpleName() + "occurred.");
        }
        System.out.println("program occurs after exception handling.");
    }
}
