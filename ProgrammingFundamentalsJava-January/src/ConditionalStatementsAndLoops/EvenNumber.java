package ConditionalStatementsAndLoops;/*
@CIHAN GUR

Take as an input an even number and print its absolute value with a message:
"The number is: {absoluteValue}".
If the number is odd, print "Please write an even number."and continue reading numbers.

 */

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = Integer.parseInt(inp.nextLine());
        while (n%2!=0){
            System.out.println("Please write an even number.");
            n=Integer.parseInt(inp.nextLine());
        }
        System.out.printf("The number is: %d",Math.abs(n));
    }
}
