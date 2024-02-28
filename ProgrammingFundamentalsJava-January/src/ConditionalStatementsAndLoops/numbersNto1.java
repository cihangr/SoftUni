package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class numbersNto1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int N = Integer.parseInt(inp.nextLine());
        for (int i=N; i>=1; i--){
            System.out.println(i);
        }
    }
}
