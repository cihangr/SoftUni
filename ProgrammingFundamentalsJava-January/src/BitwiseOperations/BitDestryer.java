package BitwiseOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
@CIHAN GUR

Write a program that sets the bit at position p to 0. Print the resulting integer.

INPUT
1313
5
OUTPUT
1281

INPUT
231
2
OUTPUT
227

INPUT
111
6
OUTPUT
47

INPUT
111
4
OUTPUT
111

*/
public class BitDestryer {
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
        binaryList.remove(n);
        binaryList.add(n,0);
        binaryList=binaryList.reversed();
        String binaryString = binaryList.stream().map(Object::toString).collect(Collectors.joining());
        int decimal = Integer.parseInt(binaryString,2);
        System.out.println(decimal);
    }
}
