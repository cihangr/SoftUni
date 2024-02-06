import java.util.Scanner;
/*
@CIHAN GUR

Read two integer numbers. Calculate the factorial of each number.
Divide the first result by the second and print the division formatted
to the second decimal point.

 */
public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i1 = scanner.nextInt();
        int i2 = scanner.nextInt();
        long f1 = fac(i1);
        long f2 = fac(i2);
        double d1 = (double) f1/f2;
        System.out.printf("%.2f",d1);;
    }
    public static long fac(int i1){
        long result=1;
        for (int i = 1; i <= i1; i++) {
            result *= i;
        }
        return result;
    }
}
