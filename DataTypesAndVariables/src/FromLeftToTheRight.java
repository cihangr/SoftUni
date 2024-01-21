import java.util.Scanner;

/*
@CIHAN GUR

You will receive a number representing how many lines we will get as input.
On the next N lines, you will receive a string with 2 numbers separated by
a single space. You need to compare them. If the left number is greater than
the right number, you need to print the sum of all digits in the left number,
otherwise, print the sum of all digits in the right number.

 */
public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = Integer.parseInt(inp.nextLine());
        int total=0;
        for (int i =0; i<n; i++){
            String number = inp.nextLine();
            String[] splitted = number.split(" ");
            long first = Long.parseLong(splitted[0]);
            long second = Long.parseLong(splitted[1]);
            if (first>=second){
                while (first!=0){
                    first=Math.abs(first);
                    long lastdigit=first%10;
                    first=(first-lastdigit)/10;
                    total+= (int) lastdigit;
                }
            } else {
                while (second!=0){
                    second=Math.abs(second);
                    long lastdigit2=second%10;
                    second=(second-lastdigit2)/10;
                    total+= (int) lastdigit2;
                }
            }
            System.out.println(total);
            total=0;
        }
    }
}
