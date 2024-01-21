import java.util.Scanner;
/*
@CIHAN GUR

Read four integer numbers. Add the first to the second, divide (integer)
the sum by the third number, and multiply the result by the fourth number.
Print the result.
Input
10
20
3
3
result:30
 */
public class IntegerOperations {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();
        int d = inp.nextInt();
        int result = ((a+b)/c)*d;
        System.out.println(result);
    }
}
