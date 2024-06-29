package StacksAndQueues.BasicStackOperations;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
@CIHAN GUR

You will be given an integer N representing the number of elements to push into the stack,
an integer S representing the number of elements to pop from the stack, and an integer X,
an element that you should check whether is present in the stack. If it is, print "true"
on the console. If it's not, print the smallest element currently present in the stack.
Input
On the first line, you will be given N, S, and X separated by a single space.
On the next line, you will be given a line of numbers separated by one or more white spaces.
Output
On a single line print, either "true" if X is present in the stack, otherwise, print the smallest element in the stack.
If the stack is empty – print 0.


INPUT
5 2 13
1 13 45 32 4
OUTPUT
true
INPUT
4 1 666
420 69 13 666
OUTPUT
13
INPUT
3 3 90
90 90 90
OUTPUT
0


*/
public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int N =input[0];
        int S =input[1];
        int X =input[2];
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            int number = scanner.nextInt();
            stack.push(number);
        }

        for (int check = 0; check < S; check++) {
            stack.pop();
        }

        if (stack.isEmpty()) {
            System.out.println(0);
        } else if (stack.contains(X)) {
            System.out.println("true");
        } else if (!stack.contains(X)) {
            System.out.println(Collections.min(stack));
        }

    }
}
