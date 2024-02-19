import java.util.Scanner;

/*
@CIHAN GUR

A number is special when its sum of digits is 5, 7, or 11.

Write a program to read an integer n and for all numbers in the
range 1…n to print the number and if it is special or not (True / False).
 */
public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int N = Integer.parseInt(inp.nextLine());
        for (int i=1; i<=N; i++) {
            int total=0;
            int j = i;
            while (j!=0){
                int lastDigit = j%10;
                j-=lastDigit;
                j/=10;
                total+= lastDigit;
            }
            if (total%5==0 || total%7==0 || total%11==0){
                System.out.printf("%d -> True\n",i);
            } else {
                System.out.printf("%d -> False\n",i);
            }
        }
    }
}
