package ConditionalStatementsAndLoops;
import java.util.Scanner;

public class sumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = Integer.parseInt(inp.nextLine());
        int b = Integer.parseInt(inp.nextLine());
        int m = Integer.parseInt(inp.nextLine());
        int counter=0;
        for (int i=a; i<=b; i++){
            for (int j=a; j<=b; j++){
                counter++;
                System.out.println(i+" "+j+" = "+m);
                if ((i+j)==m){
                    System.out.printf("Combination N:%d (%d + %d = %d)",counter,i,j,m);
                    return;
                }
            }
        }
        System.out.printf("%d combinations - neither equals %d",counter,m);
    }
}
