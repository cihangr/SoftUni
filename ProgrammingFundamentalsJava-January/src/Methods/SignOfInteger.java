package Methods;

import java.util.Scanner;
/*
@CIHAN GUR

Create a method that prints the sign of an integer number.
 */

public class SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        sign(n);
    }

    public static void sign (int n){
        if (n>0) {
            System.out.printf("The number %d is positive.",n);
        } else if (n<0) {
            System.out.printf("The number %d is negative.",n);
        } else {
            System.out.printf("The number %d is zero.",n);
        }
    }
}
