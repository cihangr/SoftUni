package StacksAndQueues.DecimalToBinaryConverter;
/*
@CIHAN GUR

Create a simple program that can convert a decimal number to its binary representation.
Implement an elegant solution using a Stack.
Print the binary representation back at the terminal.

INPUT
10
OUTPUT
1010
INPUT
1024
OUTPUT
10000000000
*/
import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimal = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        if(decimal == 0){
            System.out.println(0);
        } else {
            while (decimal != 0) {
                stack.push(decimal % 2);
                decimal = decimal / 2;
            }
            while (stack.size() > 0) {
                System.out.print(stack.pop() + "");
            }
        }
    }
}
