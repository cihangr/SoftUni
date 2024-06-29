package StacksAndQueues.ReverseNumberWithStack;

import java.util.ArrayDeque;
import java.util.Scanner;

/*
@CIHAN GUR

Write a program that reads N integers from the console and reverses them
using a stack. Use the ArrayDeque<Integer> class. Just put the input numbers in the stack and pop them.

INPUT
1 2 3 4 5
OUTPUT
5 4 3 2 1
INPUT
1
OUTPUT
1
*/
public class ReverseNumberWithStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (String number : numbers) {
            stack.push(Integer.parseInt(number));
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

        //Alternative Solution
        //int[] ArrayNumbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        //ArrayDeque<Integer> ArrayStack = new ArrayDeque<>();
        //The rest can be same like for and while loops.

        //Alternative Solution
        //ArrayDeque<Integer> OneLineDeck = new ArrayDeque<>();
        //Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).forEach(OneLineDeck::push);
        //while (!OneLineDeck.isEmpty()) {
        //    System.out.println(stack.pop() + " ");
        //}

    }
}
