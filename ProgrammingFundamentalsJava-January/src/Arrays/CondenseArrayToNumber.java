package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
@CIHAN GUR

Write a program to read an array of integers and condense them by summing adjacent 
couples of elements until a single integer is obtained. For example, if we have 3 
elements {2, 10, 3}, we sum the first two and the second two elements and obtain 
{2+10, 10+3} = {12, 13}, then we sum again all adjacent elements and obtain 
{12+13} = {25}.

 */
public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] arr = Arrays.stream(inp.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        while (arr.length>1){
            int[] condensed = new int[(arr.length-1)];
            int k=0;
            for (int i = 0; i < arr.length - 1; i++) {
                condensed[k]=arr[i]+arr[i+1];
                k++;
            }
            arr=condensed;
        }
        System.out.println(arr[0]);
    }
}