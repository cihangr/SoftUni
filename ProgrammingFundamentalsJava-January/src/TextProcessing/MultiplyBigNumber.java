package TextProcessing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
@CIHAN GUR

You are given two lines – the first one can be a really big number (0 to 1050).
The second one will be a single-digit number (0 to 9). You must display the product of these numbers.
Note: do not use the BigInteger class.

INPUT
23
2
OUTPUT
46

INPUT
9999
9
OUTPUT
89991

INPUT
923847238931983192462832102
4
OUTPUT
3695388955727932769851328408

*/
public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstNum = scanner.nextLine();
        int secondNum = Integer.parseInt(scanner.nextLine());
        System.out.println(multiply(firstNum,secondNum));
        }

    public static String multiply(String bigInteger, int singleDigit) {
        if (bigInteger.equals("0") || singleDigit == 0) {
            return "0";
        }

        boolean isNegative = bigInteger.charAt(0) == '-';
        bigInteger = bigInteger.replaceAll("-", ""); // Remove sign temporarily

        StringBuilder result = new StringBuilder();
        int carry = 0;
        for (int i = bigInteger.length() - 1; i >= 0; i--) {
            int digit = (bigInteger.charAt(i) - '0') * singleDigit + carry;
            carry = digit / 10;
            result.insert(0, digit % 10);
        }
        if (carry > 0) {
            result.insert(0, carry);
        }

        return (isNegative && singleDigit != 0) ? "-" + result : result.toString();
    }

}
