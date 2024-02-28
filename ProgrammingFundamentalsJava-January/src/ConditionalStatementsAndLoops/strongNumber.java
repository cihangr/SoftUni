/*
@CIHAN GUR

Write a program to check whether or not a given number is strong.
A number is strong if the sum of the Factorial of each digit is equal
to the number. For example 145 is a strong number, because
1! + 4! + 5! = 145. Print "yes" if the number is strong and
"no" if the number is not strong.

2 > yes
3451 > no
40585 > yes

*/

package ConditionalStatementsAndLoops;
import java.util.Scanner;

public class strongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        int N=number;
        int lastdigit,factoriel=1, total=0;
        while (number!=0){
            lastdigit=number%10;
            for (int i=1; i<=lastdigit; i++){
                factoriel*=i;
            }
            total+=factoriel;
            factoriel=1;
            number-=lastdigit;
            number/=10;
        }
        if (total==N){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
