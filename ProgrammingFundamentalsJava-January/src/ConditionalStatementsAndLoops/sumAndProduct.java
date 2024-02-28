/*
Task 6. Sum and product
Write a program that checks the sum and product of all numbers that are a combination of the four digits a , b , c and d .
Another number - n , which is read from the console - is also involved in the check .
For each combination the four digits a , b , c and d are changed as follows :
a varies from 1 to 9
b changes from 9 to a
c varies from 0 to 9
d varies from 9 to c
If the amount ( a + b + c + d ) is equal to the product ( a * b * c * d ) and simultaneously n _ ends in 5 , the number abcd should be printed .
If we divide the work ( a * b * c * d ) of the sum ( a + b + c + d ) and we get 3 ( integer ), and at the same time n is divisible by 3 without a remainder , the number dcba should be printed .
The program should print on the console only the first valid combination .
If no such number is found abcd or dcba , it should print " Nothing found ".
Login :
1 line is read from the console :
n - an integer in the range [100…1000]
Output :
1 line is printed on the console :
If a valid combination is found:
"{ number }" , where { number } is the combination abcd or the combination dcba
If no such combination is found:
"Nothing found "
Input 123	Output 8191
Input 145	Output 1412
Input 214	Output Nothing found
*/

package ConditionalStatementsAndLoops;
import java.util.Scanner;

public class sumAndProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = Integer.parseInt(input.nextLine());
        int times, total, divide;


// We can add the our variables in For Loop.
        for (int a = 1; a <= 9; a++) {
            for (int b = a; b <= 9; b++) {
                for (int c = 0; c <= 9; c++) {
                    for (int d = c; d <= 9; d++) {
                        total = a + b + c + d;
                        times = a * b * c * d;
                        divide = (int) ((double) times / total); // Cast to double before division

                        if (total == times && N % 5 == 0) {
                            System.out.println((a * 1000) + (b * 100) + (c * 10) + d);
                            return;
                        } else if (divide == 3 && N % 3 == 0) {
                            System.out.println((d * 1000) + (c * 100) + (b * 10) + a);
                            return;
                        }
                    }
                }
            }
        }

        System.out.println("Nothing found");
    }
}
