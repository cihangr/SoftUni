package ConditionalStatementsAndLoops;
import java.util.Scanner;

/*
@CIHAN GUR

Write a program that prints the next n odd numbers (starting from 1)
and on the last row prints the sum of them.

Input
On the first line, you will receive a number – n. This number shows
how many odd numbers you should print.

Output
Print the next n odd numbers, starting from 1, separated by new lines.
On the last line, print the sum of these numbers.

 */
public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n=Integer.parseInt(inp.nextLine());
        int sum = 0, counter=0;
            for (int i = 0; i <Integer.MAX_VALUE; i++) {
                if (i % 2 == 1) {
                    System.out.println(i);
                    sum+=i;
                    counter++;
                }
                if (counter==n){
                    break;
                }
            }
        System.out.printf("Sum: %d", sum);
    }
}
