package StacksAndQueues.RecursiveFibonacci;

import java.util.ArrayDeque;
import java.util.Scanner;

/*
@CIHAN GUR

Each member of the Fibonacci sequence is calculated from the sum of the two previous members.
The first two elements are 1, 1. Therefore, the sequence goes like 1, 1, 2, 3, 5, 8, 13, 21, 34…

The following sequence can be generated with an array, but that's easy, so your task is to implement it recursively.

If the function getFibonacci(n) returns the nth Fibonacci number, we can express it using

getFibonacci(n) = getFibonacci(n-1) + getFibonacci(n-2).

However, this will never end, and a Stack Overflow Exception is thrown in a few seconds.
For the recursion to stop, it has to have a "bottom". The bottom of the recursion is
getFibonacci(1), and should return 1. The same goes for getFibonacci(0).

Input
· On the only line in the input, the user should enter the wanted Fibonacci number N where 1 ≤ N ≤ 49.

Output
· The output should be the nth Fibonacci number counting from 0.


HINT:For the nth Fibonacci number, we calculate the N-1st and the N-2nd number,
but for the calculation of N-1st number, we calculate the N-1-1st(N-2nd) and
the N-1-2nd number, so we have a lot of repeated calculations.

>>>>>INPUT
5
>>>>>OUTPUT
8

>>>>>INPUT
10
>>>>>OUTPUT
89

>>>>>INPUT
21
>>>>>OUTPUT
17711
*/
public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> memo = new ArrayDeque<>();
        memo.add(0); // F(0)
        memo.add(1); // F(1)
        if(n==0){
            System.out.println(0);
        } else if(n==1){
            System.out.println(1);
        } else if (n>1) {

        for (int i = 2; i <= n+1; i++) {
            int prev1 = memo.pollLast();
            int prev2 = memo.peekLast();
            memo.addLast(prev1);
            int current = prev1 + prev2;
            memo.addLast(current);
        }

        System.out.println(memo.peekLast());
        }
    }
}
