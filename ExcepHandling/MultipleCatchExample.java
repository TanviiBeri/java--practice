package ExcepHandling;

public class MultipleCatchExample {
public static void main(String[] args){
try{
    String str = null;
    // trying to call a method on a null object, which will
    System.out.println(str.length());
}catch (NullPointerException e){
    //this block catches the NullPointerException
    System.out.println("Error: Null pointer exception!");
}catch (Exception e){
    //this block catches any other exceptions
    System.out.println("some other error occured!");
}
}
}
