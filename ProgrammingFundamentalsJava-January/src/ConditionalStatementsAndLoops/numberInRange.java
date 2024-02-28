package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class numberInRange {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int data = Integer.parseInt(inp.nextLine());
        if (data>=-100 && data<=100){
            if (data!=0){
                System.out.println("Yes");
            } else if (data==0) {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }
}
