package String;

public class StringExample {
    public static void main(String[] args){
        String str1 = "Hello";

        String str2 = new String("Java");

        System.out.println(str1);
        System.out.println(str2);
        String str3= str2.concat(str1);

        System.out.println(str3); // JavaHello

    }
}
// strings are immutable: once created cannot change
// string buffers however, are mutable. and is thread safe (vectors too)
