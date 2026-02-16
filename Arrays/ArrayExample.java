package Arrays;

public class ArrayExample {
    public static void main(String[] args){
        int[] numbers = {10,20,30,40,50};

        for(int i =0;i<numbers.length;i++){
            System.out.print(numbers[i]+ " ");
        }
        System.out.println();
        // using enhanced for loop
        for(int num: numbers){
            System.out.println(num +" ");
        }

        int[] num1 = {11,22,33,44,55};
            for(int num: num1){
            System.out.println(num + " ");
        }
        System.out.println();
        char[] wow = {'a', 'A', 'W', 'o', 'W'};
            for(char c1: wow){
            System.out.print(c1);
    }
    
    }
}