package ObjectsAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

/*
@CIHAN GUR

You will receive N - the number in the range [0 - 1000]. Calculate the Factorial of N and print the result.

INPUT
5
OUTPUT
120

INPUT
50
OUTPUT
30414093201713378043612608166064768844377641568960512000000000000
*/
public class BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factorial = scanner.nextInt();
        BigInteger num= BigInteger.valueOf(1);
        for (int i = factorial; i > 0; i--) {
            num=num.multiply(BigInteger.valueOf(i));
        }
        System.out.println(num);
    }
}
