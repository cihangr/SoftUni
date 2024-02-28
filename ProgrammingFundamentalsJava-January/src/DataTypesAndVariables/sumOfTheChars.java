package DataTypesAndVariables;

import java.util.Scanner;
/*
@CIHAN GUR

Write a program that sums the ASCII codes of n characters. Print the sum on the console.

Input

On the first line, you will receive n – the number of lines that follow.
On the next n lines – you will receive letters from the Latin alphabet.

Output

Print the total sum in the following format:
"The sum equals: {totalSum}"

Constraints

n will be in the interval [1…20].
The characters will always be either upper or lower-case letters from the English alphabet.
You will always receive one letter per line.

 */
public class sumOfTheChars {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int N = Integer.parseInt(inp.nextLine());
        int sum=0;
        for (int i=1; i<=N; i++){
            char symbol = inp.nextLine().charAt(0);
            sum+=symbol;
        }
        System.out.printf("The sum equals: %d",sum);
    }
}
