package StacksAndQueues.MatchingBrackets;
/*
@CIHAN GUR

We are given an arithmetical expression with brackets. Scan through the string and extract each sub-expression.
Print the result back at the terminal.

INPUT
1 + (2 - (2 + 3) * 4 / (3 + 1)) * 5
OUTPUT
(2 + 3)
(3 + 1)
(2 - (2 + 3) * 4 / (3 + 1))
INPUT
(2 + 3) - (2 + 3)
OUTPUT
(2 + 3)
(2 + 3)
*/
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(i);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                int start = stack.pop();
                String expression = input.substring(start, i + 1);
                System.out.println(expression);
            }
        }

    }
}
