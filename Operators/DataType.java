package Operators;

public class DataType {
     public static void main(String[] args){
        //creating an initializing custom character
        char a = 'G';

        //integer data type is generally used for numeric values
        int i=89;

        //use byte and short if memory is constant
        byte b = 4;

        //this will give error as number is larger than byte range
        //byte b1= 78898789897;

        short s = 56;

        //this will give error as number is larger than short range
        //short s1= 8282828243;

        //by default fraction value is double in java
        double d = 4.432322323;

        //for float use 'f' as suffix as standard
        float f = 4.43423432f;

        //need to hold big range of numbers we need this data type
        long l = 12121;

        System.out.println("char:" +a);
        System.out.println("integer: "+i);
        System.out.println("byte:" +b);
        System.out.println("short:" +s);
        System.out.println("float:" +f);
        System.out.println("double:" +d);
        System.out.println("long:" +l);


    
}
}
