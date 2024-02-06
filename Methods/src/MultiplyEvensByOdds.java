import java.util.Scanner;
/*
@CIHAN GUR

Create a program that reads an integer number and multiplies the sum
of all its even digits by the sum of all its odd digits:

Examples

Input Output Comments

12345 54 12345 has 2 even digits - 2 and 4. Even digits have a sum of 6. Also,
it has 3 odd digits - 1, 3, and 5. Odd digits have a sum of 9. Multiply 6 by 9,
and you get 54.
 */
public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        System.out.println(multi(N));
    }
    public static int multi(int n){
        n=Math.abs(n);
        int oddSums=0, evenSums=0;
        while (n!=0){
            int lastdigit = n%10;
            n-=lastdigit;
            n/=10;
            if (lastdigit%2==0){
                evenSums+=lastdigit;
            } else {
                oddSums+=lastdigit;
            }
        }
        return evenSums*oddSums;
    }
}
