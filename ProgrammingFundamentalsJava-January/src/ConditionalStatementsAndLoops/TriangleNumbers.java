package ConditionalStatementsAndLoops;

import java.util.Scanner;

/*
@CIHAN GUR

Write a program that receives a number – n and prints a triangle
from 1 to n as in the examples.

Constraints

· n will be in the interval [1...20].
1
2 2
3 3 3
4 4 4 4
 */
public class TriangleNumbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
