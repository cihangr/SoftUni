package DataTypesAndVariables;
/*
@CIHAN GUR

You will be given a single integer. Your task is to find the sum of its digits.
 */

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int N = inp.nextInt();
        int lastdigit, total=0;
        while (N!=0){
            lastdigit=N%10;
            N=(N-lastdigit)/10;
            total+=lastdigit;
        }
        System.out.println(total);
    }
}
