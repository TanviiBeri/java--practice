import java.util.Scanner;
public class Inputs{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter first num:");
        int num1 = sc.nextInt();
        System.out.println("enter second num:");
        int num2 = sc.nextInt();
        
        int num = num1 + num2;
        System.out.println("addition is " +num);

    }
}
