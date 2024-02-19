package ConditionalStatementsAndLoops;
/*
@CIHAN GUR

You will receive an integer as input from the console. Print the 10 times
table for this integer. See the examples below for more information.

Output
Print every row of the table in the following format:
{theInteger} X {times} = {product}

 */

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = Integer.parseInt(inp.nextLine());
        for (int i=1; i<=10; i++){
            System.out.printf("%d X %d = %d\n",n,i,(n*i));
        }
    }
}
