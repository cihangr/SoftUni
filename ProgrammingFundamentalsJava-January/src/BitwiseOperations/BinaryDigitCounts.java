package BitwiseOperations;
/*
@CIHAN GUR

You are given a positive integer number and one binary digit B (0 or 1).
Your task is to write a program that finds the number of binary digits (B) in a given integer.

INPUT
20
0
OUTPUT
3

INPUT
15
1
OUTPUT
4

INPUT
10
0
OUTPUT
2

*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinaryDigitCounts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int binary = Integer.parseInt(scanner.nextLine());
        List<Integer> binaryList = new ArrayList<>();
        while (N!=0){
            if (N%2==0){
                binaryList.add(0);
                N/=2;
            } else {
                binaryList.add(1);
                N=(N-1)/2;
            }
        }
        int counterZero=0, counterOne=0;
        for (Integer list : binaryList){
            if (binary==0){
                if (list==0) counterZero++;
            } else if (binary==1) {
                if (list==1) counterOne++;
            }
        }
        if (binary==0) System.out.println(counterZero);
        if (binary==1) System.out.println(counterOne);
    }
}
