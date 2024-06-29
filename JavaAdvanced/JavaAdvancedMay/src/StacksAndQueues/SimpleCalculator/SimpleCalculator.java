package StacksAndQueues.SimpleCalculator;
/*
@CIHAN GUR

Create a simple calculator that can evaluate simple expressions that will not hold any operator different from addition and subtraction. There will not be parentheses or operator precedence.
Solve the problem using a Stack.

INPUT
2 + 5 + 10 - 2 - 1
OUTPUT
14
INPUT
2 - 2 + 5
OUTPUT
5

*/

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] command = scanner.nextLine().split("\\s+");

        ArrayDeque<String> stack = new ArrayDeque<>();
        Collections.addAll(stack, command);

        while (stack.size() > 1) {
            int first = Integer.parseInt(stack.pop());
            String operator = stack.pop();
            int second = Integer.parseInt(stack.pop());

            switch (operator) {
                case "+": stack.push(String.valueOf(first + second)); break;
                case "-": stack.push(String.valueOf(first - second)); break;
                case "*": stack.push(String.valueOf(first * second)); break;
                case "/": stack.push(String.valueOf(first / second)); break;
                case "%": stack.push(String.valueOf(first % second)); break;
                case "sqrt": stack.push(String.valueOf(Math.sqrt(first))); break;
                case "sin": stack.push(String.valueOf(Math.sin(first))); break;
                case "cos": stack.push(String.valueOf(Math.cos(first))); break;
                case "tan": stack.push(String.valueOf(Math.tan(first))); break;
                case "cbrt": stack.push(String.valueOf(Math.cbrt(first))); break;
                case "abs": stack.push(String.valueOf(Math.abs(first))); break;
                case "pow": stack.push(String.valueOf(Math.pow(first, second))); break;
            }

        }
        System.out.println(stack.pop());
    }
}
