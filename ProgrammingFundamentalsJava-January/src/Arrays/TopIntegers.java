package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
@CIHAN GUR

Write a program to find all the top integers in an array. A top integer
is an integer that is bigger than all the elements to its right.

 */
public class TopIntegers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] arr = Arrays.stream(inp.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int maxNumber=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>arr[maxNumber]) {
                maxNumber = i;
            }
        }
            for (int i = maxNumber; i < arr.length-1; i++) {
                if(arr[i]>arr[i+1]) System.out.print(arr[i]+" ");
            }
                System.out.print(arr[arr.length-1]);

    }
}