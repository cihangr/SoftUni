package ObjectsAndClasses;

import java.math.BigInteger;
import java.util.Scanner;
/*
@CIHAN GUR
You will receive two numbers (0 to 1050), and print their sum.

INPUT
923847238931983192462832102
934572893617836459843471846187346
OUTPUT
934573817465075391826664309019448

INPUT
100
4
OUTPUT
104

*/
public class SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger firstNumber = new BigInteger(scanner.nextLine());
        BigInteger secondNumber = new BigInteger(scanner.nextLine());
        System.out.println(firstNumber.add(secondNumber));
    }
}
