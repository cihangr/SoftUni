package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
@CIHAN GUR

Write a program that calculates the difference between the sum of the even
and the sum of the odd numbers in an array.
 */
public class EvenAndOddSubstraction {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] numbers = Arrays
                        .stream(inp.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        int totalEven=0, totalOdd=0, result;
        for (int i=0; i<numbers.length; i++){
            if (numbers[i]%2==0){
                totalEven+=numbers[i];
            } else {
                totalOdd+=numbers[i];
            }
        }
        result=(totalEven-totalOdd);
        System.out.println(result);
    }
}