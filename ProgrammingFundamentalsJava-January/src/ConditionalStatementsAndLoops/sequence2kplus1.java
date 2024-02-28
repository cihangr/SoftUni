package ConditionalStatementsAndLoops;
import java.util.Scanner;

public class sequence2kplus1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int A = Integer.parseInt(inp.nextLine());
        int number=1;
        while (number<=A){
            System.out.println(number);
            number=number*2+1;
        }

    }
}
