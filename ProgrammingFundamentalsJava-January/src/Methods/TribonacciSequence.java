package Methods;

import java.util.Scanner;
/*
@CIHAN GUR

In the "Tribonacci" sequence, every number is formed by the sum of the previous 3.
You are given a number num. Write a program that prints num numbers from the Tribonacci
sequence, each on a new line, starting from 1. The input comes as a parameter named num.
The value num will always be a positive integer.

 */

public class TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Tri(N);
    }
    public static void Tri(int n){
        int a=0;
        int b=1;
        int c=1;
        int d;
        if (n==1){
            System.out.println(b);
        } else {
            System.out.print(b + " " + c + " ");
        }
        while (n-- >2){
            d=a+b+c;
            a=b;
            b=c;
            c=d;
            System.out.print(c+" ");
        }
    }
}
