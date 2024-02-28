package Arrays;

import java.util.Scanner;

/*
@CIHAN GUR

The Fibonacci sequence is quite a famous sequence of numbers. Each sequence member
is calculated from the sum of the two previous elements. The first two elements are
1, 1. Therefore, the sequence goes like 1, 1, 2, 3, 5, 8, 13, 21, 34… The following
sequence can be generated with an array, but that's easy, so your task is to
implement it recursively.
So if the function GetFibonacci(n) returns the n’th Fibonacci number we can express
it using GetFibonacci(n) = GetFibonacci(n-1) + GetFibonacci(n-2).
However, this will never end and in a few seconds, a StackOverflow Exception is thrown.
For the recursion to stop, it has to have a "bottom". At the bottom of the recursion is
GetFibonacci(2) should return 1, and GetFibonacci(1) should return 1.

Input
· The user should enter the wanted Fibonacci number on the only line in the input.

Output
· The output should be the n'th Fibonacci number counting from 1.

Constraints
· 1 ≤ N ≤ 50
 */
public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = Integer.parseInt(inp.nextLine());
        System.out.println(getFibonacci(n));
    }

    public static int getFibonacci(int n) {
        if (n <= 2) {
            return 1;
        }

        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }
}