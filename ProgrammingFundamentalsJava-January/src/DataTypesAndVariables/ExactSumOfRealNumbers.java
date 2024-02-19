import java.math.BigDecimal;
import java.util.Scanner;
/*
@CIHAN GUR

Write a program to enter n numbers and calculate and print their exact sum (without rounding).
 */
public class ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int N = inp.nextInt();
        BigDecimal total = BigDecimal.valueOf(0);
        for (int i=0; i<N; i++){
            BigDecimal number = inp.nextBigDecimal();
            total = total.add(number);
        }
        System.out.println(total);
    }
}
