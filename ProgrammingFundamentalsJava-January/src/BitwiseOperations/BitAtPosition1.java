package BitwiseOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
@CIHAN GUR

Write a program that prints the bit at position 1 of the given integer.
We use the standard counting: from right to left, starting from 0.

INPUT
2
OUTPUT
1

INPUT
51
OUTPUT
1

INPUT
13
OUTPUT
0

INPUT
24
OUTPUT
0

*/
public class BitAtPosition1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
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
        binaryList=binaryList.reversed();
        System.out.println(binaryList.get(binaryList.size()-2));
    }
}
