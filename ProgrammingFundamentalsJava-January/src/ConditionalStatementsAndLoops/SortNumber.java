/*
@CIHAN GUR

Read three real numbers and sort them in descending order.
Print each number on a new line.
 */

package ConditionalStatementsAndLoops;
import java.util.Scanner;

public class SortNumber {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double a = inp.nextDouble();
        double b = inp.nextDouble();
        double c = inp.nextDouble();
        double big, mid, small;
        if (a>b){
            if (a>c){
                big=a;
                if (b>c){
                    mid=b;
                    small=c;
                } else {
                    mid=c;
                    small=b;
                }
            } else {
                big=c;
                if (b>a){
                    mid=b;
                    small=a;
                } else {
                    mid=a;
                    small=b;
                }

            }
        } else {
            if (b>c){
                big=b;
                if (a>c){
                    mid=a;
                    small=c;
                } else {
                    mid=c;
                    small=a;
                }
            } else {
                big=c;
                if (a>b){
                    mid=a;
                    small=c;
                } else {
                    mid=c;
                    small=a;
                }
            }
        }
        System.out.printf("%.0f\n%.0f\n%.0f\n",big,mid,small);

    }
}
