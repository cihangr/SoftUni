package StacksAndQueues.BalancedParentheses;
/*
@CIHAN GUR

Given a sequence consisting of parentheses, determine whether the expression is balanced.
A sequence of parentheses is balanced if every open parenthesis can be paired uniquely
with a closing parenthesis that occurs after the former. Also, the interval between them
must be balanced. You will be given three types of parentheses: (, {, and [.
{[()]} - This is a balanced parenthesis.
{[(])} - This is not a balanced parenthesis.
Input
Each input consists of a single line, the sequence of parentheses.
1 ≤ Length of sequence ≤ 1000.
Each character of the sequence will be one of the following: {, }, (, ), [, ].
Output
For each test case, print on a new line "YES" if the parentheses are balanced. Otherwise, print "NO".

INPUT
{[()]}
OUTPUT
YES

INPUT
{[(])}
OUTPUT
NO

INPUT
{{[[(())]]}}
OUTPUT
YES
*/
import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (Character c : input.toCharArray()){
            if(c == '{' || c == '[' || c == '('){
                stack.push(c);
            } else {
                if(stack.isEmpty() ||!isMatchingParentheses(stack.pop(),c)){
                    System.out.println("NO");
                    return;
                }
            }
        }

        System.out.println("YES");
    }
    static boolean isMatchingParentheses(char left, char right){
            if(left == '{') return right == '}';
            else if(left == '[') return right == ']';
            else return right == ')';
    }
}
