import java.util.Scanner;

/*   @cihangr

Write a program to display numbers from given start to given end and their sum.
All the numbers will be integers. On the first line, you will receive the start number
on the second the end number.
*/
public class printAndSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int total=0;
        for (int i =number1; i<=number2; i++){
            System.out.print(i+" ");
            total+=i;
        }
        System.out.println("\nSum: "+total);
    }
}
