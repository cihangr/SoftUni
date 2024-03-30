package BitwiseOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
@CIHAN GUR

Write a program that prints the bit at position p of the given integer.
We use the standard counting: from right to left, starting from 0.

INPUT
2145
5
OUTPUT
1

INPUT
512
0
OUTPUT
0

INPUT
111
OUTPUT
0

INPUT
255
OUTPUT
1

*/
public class PthBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
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
        for (int i = 0; i < 16-binaryList.size(); i++) {
            binaryList.add(0);
        }
        System.out.println(binaryList.get(n));
    }
}
