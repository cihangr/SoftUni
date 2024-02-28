package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
@CIHAN GUR

Read an array from the console and sum only the even numbers.
 */
public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] numbers = Arrays
                .stream(inp.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum=0;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]%2 == 0){
                sum+= numbers[i];
            }
        }
        System.out.println(sum);
    }
}
