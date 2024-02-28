package Arrays;

import java.util.Scanner;

/*
@CIHAN GUR

Write a program that creates 2 arrays. You will be given an integer n.
On the next n lines, you get 2 integers. Form 2 arrays as shown below.

4
1 5
9 10
31 81
41 20

Output = 5 9 81 41
         1 10 31 20
 */
public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = Integer.parseInt(inp.nextLine());
        String[] arr1 = new String[n];
        String[] arr2 = new String[n];

        for (int i = 1; i <= n; i++) {
            String[] data =inp.nextLine().split(" ");
            String firstElement = data[0];
            String secondElement = data[1];
            if (i%2!=0){
                arr1[i-1]=firstElement;
                arr2[i-1]=secondElement;
            } else {
                arr1[i-1]=secondElement;
                arr2[i-1]=firstElement;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr2[i]+" ");
        }
    }
}